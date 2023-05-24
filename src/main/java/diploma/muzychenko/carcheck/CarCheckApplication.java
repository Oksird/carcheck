package diploma.muzychenko.carcheck;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import diploma.muzychenko.carcheck.domain.Authority;
import diploma.muzychenko.carcheck.domain.User;
import diploma.muzychenko.carcheck.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;



@SpringBootApplication
public class CarCheckApplication {

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private UserDetailsRepository userDetailsRepository;

	public static void main(String[] args) {
		SpringApplication.run(CarCheckApplication.class, args);
	}

	@PostConstruct
	protected void init() {

		List<Authority> authorityList=new ArrayList<>();

		authorityList.add(createAuthority("USER","User role"));
		//authorityList.add(createAuthority("ADMIN","Admin role"));

		User user=new User();

		user.setUserName("pardeep161");
		user.setFirstName("Pardeep");
		user.setLastName("K");

		user.setPassword(passwordEncoder.encode("pardeep@123"));
		user.setEnabled(true);
		user.setAuthorities(authorityList);

		userDetailsRepository.save(user);



	}


	private Authority createAuthority(String roleCode,String roleDescription) {
		Authority authority=new Authority();
		authority.setRoleCode(roleCode);
		authority.setRoleDescription(roleDescription);
		return authority;
	}



}