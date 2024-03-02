interface calci
{
public int getSum(int n1,int n2);
}

class Calciimpl implements calci
{
public int getSum(int n1,int n2)
{
System.out.println("hi");
return n1+n2;
}
}