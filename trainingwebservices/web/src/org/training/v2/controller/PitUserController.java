package org.training.v2.controller;


import de.hybris.platform.commercefacades.user.data.AddressData;
import de.hybris.platform.commercewebservicescommons.dto.user.AddressWsDTO;
import de.hybris.platform.webservicescommons.swagger.ApiFieldsParam;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.training.facades.PitUser.PitUserFacade;
import org.training.facades.product.data.PitUserData;
import org.training.queues.data.PitUserDataList;
import org.training.user.data.PitUserDataListWSDTO;
import org.training.user.data.PitUserDataWSDTO;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping(value = "/{baseSiteID}/pitUser")
public class PitUserController extends BaseController {
    @Resource(name = "pitUserFacade")
    private PitUserFacade pitUserFacade;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public PitUserDataListWSDTO getPitUserDetails(
       @ApiParam(value = "Response Configuration. This is the list of fields that should be returned in the response body", allowableValues = "BASIC,DEFAULT,FULL")
       @ApiFieldsParam @RequestParam(defaultValue = DEFAULT_FIELD_SET) final String fields) {
        final var pitUserDataList = new PitUserDataList();
        var allPitUsers = pitUserFacade.getAllPitUsers();
        pitUserDataList.setPitUser(allPitUsers);
        return getDataMapper().map(pitUserDataList, PitUserDataListWSDTO.class,fields);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/createUser")
    @ResponseBody
    @ResponseStatus(value = HttpStatus.CREATED)
        public void createPitUser(@ApiFieldsParam @RequestBody final PitUserData request) {
        pitUserFacade.insertPitUser(request);
    }

}

