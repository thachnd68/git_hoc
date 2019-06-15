package phanso;

public class PhanSo {
private int tu,mau;
public void settu (int tu) {
    this.tu=tu;
}
public void setmau (int mau) {
    this.mau=mau;
}
public int gettu (){
    return this.tu;
}
public int getmau (){
    return this.mau;
}
// In phan so
    @Override
public String toString (){
    return this.tu+ "/" + this.mau;
}
public int ucln (int a, int b){
a = Math.abs(a);
b = Math.abs(b);
if(a==0) return b;
if(b==0) return a;
    while (a!=b)
        if (a>b) 
            a=a-b;
        else 
            b=b-a;
    return a;
}
// Rut gon
public void rutGon(){
    int uc = ucln(this.tu,this.mau);
    this.tu=this.tu/uc;
    this.mau=this.mau/uc;
}
public void nhan (PhanSo a,PhanSo b){
    this.tu=a.tu * b.tu;
    this.mau=a.mau * b.mau;
    this.rutGon();   
}
public void cong (PhanSo a,PhanSo b){
    this.tu = a.tu * b.mau + a.mau * b.tu;
    this.mau = a.mau * b.mau;
    this.rutGon();
}
public void tru (PhanSo a,PhanSo b){
    this.tu = a.tu * b.mau - a.mau * b.tu;
    this.mau = a.mau * b.mau;
    this.rutGon();
}  
public void chia (PhanSo a,PhanSo b){
    this.tu = a.tu * b.mau ;
    this.mau = a.mau * b.tu;
    this.rutGon();
}
   /* public static void main(String[] args) {
      PhanSo a = new PhanSo();
      PhanSo b = new PhanSo();
      a.settu(6);
      a.setmau(8);
      b.settu(3);
      b.setmau(5);
      PhanSo c = new PhanSo();
      c.nhan(a, b);
      System.out.println(c);
      c.cong(a, b);
      System.out.println(c);
      c.tru(a, b);
      System.out.println(c);
      c.chia(a, b);
      System.out.println(c);
    }*/
    
}
