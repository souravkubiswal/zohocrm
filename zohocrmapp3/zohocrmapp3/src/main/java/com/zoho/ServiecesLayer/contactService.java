package com.zoho.ServiecesLayer;

import java.util.List;

import com.zoho.Entities.Contacts;

public interface contactService {
	public void savecontactInformaton(Contacts contact);
	public List<Contacts> getAllContacts();
	public Contacts findContactById(long id);
}
