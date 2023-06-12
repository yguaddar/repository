public class Kreis extends Figur{
  private double radius;

  // Anfang Attribute
  // Ende Attribute


  // Anfang Methoden
  // Ende Methoden
}
public void setRadius(double radius){
  this.radius=radius;
}
public void getRadius(){
  return radius;
}
public double getFlaeche(){
  if(radius == 0){
    radius=10;
    this.flaeche=(3.14*radius*radius);
    return this.flaeche;
  }
}

recheck0new Rechteck();
rech.getFlaeche();
kreis k1=new kreis();
k1.setRadius();
k1,getFlaeche();