package org.training.v2.controller;


import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.training.facades.PitUser.PitUserFacade;
import org.training.facades.product.data.PitUserData;
import org.training.queues.data.PitUserDataList;
import org.training.user.data.PitUserDataListWSDTO;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/{baseSiteID}/pitUser")
public class PitUserController extends BaseController {
    @Resource(name = "pitUserFacade")
    private PitUserFacade pitUserFacade;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public PitUserDataListWSDTO getPitUserDetails(
            @ApiParam(value = "Response Configuration. This is the list of fields that should be returned in the response body", allowableValues = "BASIC,DEFAULT,FULL") @RequestParam(defaultValue = DEFAULT_FIELD_SET)final String fields) {
        final var pitUserDataList = new PitUserDataList();
        var allPitUsers = pitUserFacade.getAllPitUsers();
        pitUserDataList.setPitUser(allPitUsers);
        return getDataMapper().map(pitUserDataList, PitUserDataListWSDTO.class, fields);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/createUser")
    @ResponseBody
    @ResponseStatus(value = HttpStatus.CREATED)
        public void createPitUser(@RequestBody final PitUserData request) {
        pitUserFacade.insertPitUser(request);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/updateUsername/{pitId}")
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public void updateUsername(@PathVariable final int pitId) {
        pitUserFacade.updateUsername(pitId);
    }
    @RequestMapping(method = RequestMethod.POST,value = "/sendEmail/{pitId}")
    @ResponseBody
    @ResponseStatus(value = HttpStatus.OK)
    public void sendEmail(@PathVariable final int pitId) {
        pitUserFacade.sendEmail(pitId);
    }
}

