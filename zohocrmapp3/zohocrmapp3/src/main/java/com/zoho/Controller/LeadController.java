package com.zoho.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zoho.Entities.Contacts;
import com.zoho.Entities.Lead;
import com.zoho.ServiecesLayer.LeadService;
import com.zoho.ServiecesLayer.contactService;

@Controller
public class LeadController {
	@Autowired
	private LeadService leadService;
	
	@Autowired
	private contactService contactService;
	
	//http://localhost:8080/create
	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String viewCreateLeadForm() {
		return"create_lead";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveOneLead(@ModelAttribute("lead") Lead lead, Model model) {
		leadService.saveLeadInformaton(lead);
		model.addAttribute("lead", lead);
		model.addAttribute("msg", "Lead is saved!!!");
		return "lead_info";
	}
	//http://localhost:8080/listleads
	@RequestMapping("listleads")
	public String listLeads(Model model) {
		
		List<Lead> leads = leadService.getAllLeads();
		model.addAttribute("leads", leads);
		return"list_leads";
	}
	@RequestMapping("/leadinfo")
	public String leadinfo(@RequestParam("id") long id, Model model){
		Lead lead = leadService.findLeadById(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id, Model model) {
		Lead lead = leadService.findLeadById(id);
		Contacts contact = new Contacts();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setMobile(lead.getMobile());
		contact.setSource(lead.getSource());
		
		contactService.savecontactInformaton(contact);
		
		leadService.deleteOneLead(id);

		List<Contacts> contacts = contactService.getAllContacts();
		model.addAttribute("contacts", contacts);
		return "listcontacts";
		
	}
}
