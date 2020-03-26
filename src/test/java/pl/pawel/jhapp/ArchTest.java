package pl.pawel.jhapp;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {
        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("pl.pawel.jhapp");

        noClasses()
            .that()
            .resideInAnyPackage("pl.pawel.jhapp.service..")
            .or()
            .resideInAnyPackage("pl.pawel.jhapp.repository..")
            .should()
            .dependOnClassesThat()
            .resideInAnyPackage("..pl.pawel.jhapp.web..")
            .because("Services and repositories should not depend on web layer")
            .check(importedClasses);
    }
}
