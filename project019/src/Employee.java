public abstract class Employee {
  private String name,family,socialSecurityNumber;

  public Employee(String name,String family,String socialSecurityNumber){
      this.name=name;
      this.family=family;
      this.socialSecurityNumber=socialSecurityNumber;
  }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public abstract double earnings();
    @Override
    public String toString() {
        return String.format("%s %s  \nSocialSecurity Number : %s",
                getName(),getFamily(),getSocialSecurityNumber());
    }
}
