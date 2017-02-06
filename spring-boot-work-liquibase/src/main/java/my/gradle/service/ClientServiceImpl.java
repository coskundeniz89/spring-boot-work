package my.gradle.service;

import my.gradle.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by coskun.deniz on 30.01.2017.
 */
@Service
public class ClientServiceImpl implements ClientService {

  @Autowired
  private ClientRepository clientRepository;

  @Override
  public long getAllClientCount() {
    return clientRepository.count();
  }

}
