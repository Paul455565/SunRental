package za.ac.cput.service;

import za.ac.cput.domain.ContactMessage;

import java.util.List;

public interface IContactMessageService extends IService<ContactMessage, Long> {
    List<ContactMessage> getAll();
}
