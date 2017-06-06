package net.ameizi.repository;

import net.ameizi.entity.BigCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// 通过该注解，可以修改 URI 的Path
@RepositoryRestResource(collectionResourceRel = "companies",path = "companies")
public interface BigCompanyRepository extends JpaRepository<BigCompany, Integer> {
}
