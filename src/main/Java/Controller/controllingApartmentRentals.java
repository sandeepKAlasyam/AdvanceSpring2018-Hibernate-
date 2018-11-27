package Controller;

import com.bellinfo.spring.project.pa.Model.ApartmentRentals;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping
@Controller
public class controllingApartmentRentals {
    @RequestMapping(value="/",method = RequestMethod.GET)
    public String getIndex(Model model){
        ApartmentRentals apto1 = new ApartmentRentals();
        model.addAttribute("apt",apto1);
        return "ApartmentRental-loginPage";
    }
    @RequestMapping(value="/index",method=RequestMethod.GET)
    public String getIndexPage(Model model){
        ApartmentRentals apto2=new ApartmentRentals();
        model.addAttribute("apt1",apto2);
        return "ApartmentRental-loginPage";
    }


}
