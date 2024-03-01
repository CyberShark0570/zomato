package com.replica.zomato.runnner;

import com.replica.zomato.entity.user.Customer;
import com.replica.zomato.entity.user.DeliveryAgent;
import com.replica.zomato.enums.UserTypeEnum;
import com.replica.zomato.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class ZomatoCommandLineRunner implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.saveAll(Arrays.asList(
                new Customer("Manikandan",
                        "Manikandan",
                        "M",
                        "manivasagan1712@gmail.com",
                        "+919566442324",
                        "Manikan@1712",
                        UserTypeEnum.CUSTOMER),
                new DeliveryAgent("Manikandan M",
                        "Manikandan",
                        "M",
                        "manivasagan1712@gmail.com",
                        "+919566442324",
                        "Manikan@1712",
                        UserTypeEnum.DELIVERY_AGENT,
                        "agent_1",
                        4.5
                )));
    }
}
