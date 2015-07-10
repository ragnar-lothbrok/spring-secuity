package com.company.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/main")
public class MainController {

    protected static Logger logger = Logger.getLogger("controller");

    @RequestMapping(value = "/common", method = RequestMethod.GET)
    public String getCommonPage() {
        logger.debug("Received request to show common page");
        return "commonpage";
    }

    /**
     * Handles and retrieves the admin JSP page that only admins can see
     */
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String getAdminPage() {
        logger.debug("Received request to show admin page");

        return "adminpage";
    }
}
