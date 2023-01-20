package org.training.v2.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.training.facades.pituser.PitUserFacade;
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
    public PitUserDataListWSDTO getPitUserDetails() {
        final var pitUserDataList = new PitUserDataList();
        var allPitUsers = pitUserFacade.getAllPitUsers();
        pitUserDataList.setPitUser(allPitUsers);
        return getDataMapper().map(pitUserDataList, PitUserDataListWSDTO.class);
    }
}

