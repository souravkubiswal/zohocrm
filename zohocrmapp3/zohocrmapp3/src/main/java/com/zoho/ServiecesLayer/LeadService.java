package com.zoho.ServiecesLayer;

import java.util.List;

import com.zoho.Entities.Lead;

public interface LeadService {
	public void saveLeadInformaton(Lead lead);
	public List<Lead> getAllLeads();
	public Lead findLeadById(long id);
	public void deleteOneLead(long id);
}
