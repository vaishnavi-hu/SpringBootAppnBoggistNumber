package com.sathya.Controllere;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NumberController {
@RequestMapping("/")
public String biggestNumberForm()
{
	return "number";
}
@RequestMapping("/submit")
public String printBiggestNumber(@RequestParam int fnum,@RequestParam int snum,@RequestParam int tnum,ModelMap model)
{
model.put("k1", fnum);
model.put("k2", snum);
model.put("k3", tnum);
int biggestNumber = (fnum > snum) ? fnum : ((snum > tnum) ? snum : tnum);
 model.put("biggestNumber", "biggestNumber");
return "result";

}
}