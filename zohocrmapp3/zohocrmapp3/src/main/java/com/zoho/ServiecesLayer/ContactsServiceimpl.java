package com.zoho.ServiecesLayer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zoho.Entities.Contacts;
import com.zoho.Entities.Lead;
import com.zoho.Repositries.ContactRepository;
import com.zoho.Repositries.LeadRepository;

@Service
public class ContactsServiceimpl implements contactService {

	@Autowired
	private ContactRepository contactRepo;
	
	@Override
	public void savecontactInformaton(Contacts contact) {
		contactRepo.save(contact);
	}

	@Override
	public List<Contacts> getAllContacts(){
		List<Contacts> Contacts = contactRepo.findAll();
		return Contacts;
	}

	@Override
	public Contacts findContactById(long id){
		Optional<Contacts> findById = contactRepo.findById(id);
		Contacts Contacts = findById.get();
		return Contacts;
	}

}
