package case2;

class Employee implements Sortable {
  public Employee(String n, double s, int day, int month, int year) {
    name = n;
    salary = s;
    hireday = day;
    hiremonth = month;
    hireyear = year;
  }

  public void print() {
    System.out.println(name + " " + salary + " " + hireYear());
  }

  public void raiseSalary(double byPercent) {
    salary *= 1 + byPercent / 100;
  }

  public int hireYear() {
    return hireyear;
  }

  private String name;
  private double salary;
  private int hireday;
  private int hiremonth;
  private int hireyear;

  // getter
  public double getSalary() {
    return salary;
  }

  @Override
  public int compare(Sortable b) {
    Employee eb = (Employee) b;
    if (salary < eb.salary)
      return -1;
    if (salary > eb.salary)
      return +1;
    return 0;
  }

  @Override
  public void shell_sort(Sortable[] a) {
    // Shell sort body
    int n = a.length;

    for (int gap = n / 2; gap > 0; gap /= 2) {
      for (int i = gap; i < n; i++) {
        Sortable temp = a[i];
        int j;
        for (j = i; j >= gap && a[j - gap].compare(temp) > 0; j -= gap) {
          a[j] = a[j - gap];
        }
        a[j] = temp;
      }
    }
  }
}
