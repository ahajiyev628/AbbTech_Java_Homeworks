package homework9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public interface FamilyDao {
    List<Family> getAllFamilies();
    Family getFamilyByIndex(int index);
    Boolean deleteFamily(int index);
    Boolean deleteFamily(Family f);
    List<Family> saveFamily(Family f);
    List<Family> displayAllFamilies();
    List<Family> getFamiliesBiggerThan(int n);
    List<Family> getFamiliesLessThan(int n);
    int countFamiliesWithMemberNumber();
    void createNewFamily(Human father, Human mother, List<Human> children);
    void deleteFamilyByIndex(int index);
    Family deleteAllChildrenOlderThen(Family f, int n);
    void bornChild(Family family, String gender);
    Family adoptChild(Family f, Human child) ;
    int count() ;
    Family getFamilyById(int id);
    List<Pet> getPets(int family_index, int index);
    void addPet(int index, Pet p);
}
