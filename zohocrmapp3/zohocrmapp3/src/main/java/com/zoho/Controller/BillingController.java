package com.zoho.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho.Entities.Billing;
import com.zoho.Entities.Contacts;
import com.zoho.ServiecesLayer.BillingService;
import com.zoho.ServiecesLayer.contactService;

@Controller
public class BillingController {
	@Autowired
	private contactService contactService;
	@Autowired
	private BillingService billingservice;
	
	@RequestMapping("/billingForm")
	public String billingForm(@RequestParam("contactId") long id, Model model) {
		
		Contacts contact = contactService.findContactById(id);
		model.addAttribute("contact", contact);
		return "create_bill";
		
	}
	@RequestMapping("/generateBill")
	public String generateBill(@ModelAttribute("billing") Billing billing) {
		billingservice.generateInvoice(billing);
		return "create_bill";
		
	}
}
