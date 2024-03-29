package org.training.v2.controller;


import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.training.facades.PitUser.PitUserFacade;
import org.training.facades.product.data.CountData;
import org.training.facades.product.data.PitAddressData;
import org.training.facades.product.data.PitUserData;
import org.training.queues.data.PitUserDataList;
import org.training.user.data.PitUserDataListWSDTO;

import javax.annotation.Resource;
import java.util.Objects;

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

    @RequestMapping(method = RequestMethod.POST,value = "/createAddress/{pitId}")
    @ResponseBody
    @ResponseStatus(value = HttpStatus.CREATED)
    public void createPitAddress(@PathVariable final int pitId,@RequestBody final PitAddressData pitAddressData) {
        pitUserFacade.insertPitAddress(pitId,pitAddressData);
    }

    @RequestMapping(value = "/getJsonResponse", method = RequestMethod.GET)
    @ResponseBody
    public CountData getJsonResponse() {
        return pitUserFacade.getCountModel();
    }

}

