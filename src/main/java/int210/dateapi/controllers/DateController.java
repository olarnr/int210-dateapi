package int210.dateapi.controllers;
import int210.dateapi.services.DateService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@RequestMapping("/api/date")
public class DateController {
    
    @GetMapping @ResponseBody
    public String currentDate() {
	    return DateService.getCurrentDate();
    }
}
