/*
A really cool example using conditions
*/

public class PhoneNumber.java
{
  // field vars
  private String phoneNumber;

  //*********************************
  //Constructor
  public PhoneNumber()
{
  phoneNumber = "100-100-1000"
}
  //*********************************
  //Methods

  public void changeNumber(int areaCode, int numBegin, int numEnd )
  {
    //if areaCode is bad, tell user to input something else.
    if (areaCode < 100 || areaCode > 999)
    {

    }
    phoneNumber =  areaCode+ "-" + numBegin + "-"
 + numEnd;
}
}