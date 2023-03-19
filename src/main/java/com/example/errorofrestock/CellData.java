package com.example.errorofrestock;

////import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import androidx.databinding.InverseMethod;

public class CellData extends BaseObservable {
  private double data00 = 0d;
  private double data01 = 0d;
  private double data02 = 0d;
  private double data03 = 0d;
  private double data04 = 0d;
  private double data10 = 0d;
  private double data11 = 0d;
  private double data12 = 0d;
  private double data13 = 0d;
  private double data14 = 0d;
  private double data20 = 0d;
  private double data21 = 0d;
  private double data22 = 0d;
  private double data23 = 0d;
  private double data24 = 0d;
  private double data30 = 0d;
  private double data31 = 0d;
  private double data32 = 0d;
  private double data33 = 0d;
  private double data34 = 0d;
  private double data100 = 0d;
  private double data101 = 0d;
  private double data102 = 0d;
  private double data103 = 0d;
  private double data110 = 0d;
  private double data111 = 0d;
  private double data112 = 0d;
  private double data113 = 0d;
  private double data120 = 0d;
  private double data121 = 0d;
  private double data122 = 0d;
  private double data123 = 0d;

  @Bindable
  public double getData00(){return data00;}
  @Bindable
  public double getData01(){return data01;}
  @Bindable
  public double getData02(){return data02;}
  @Bindable
  public double getData03(){return data03;}
  @Bindable
  public double getData04(){return data04;}
  @Bindable
  public double getData10(){return data10;}
  @Bindable
  public double getData11(){return data11;}
  @Bindable
  public double getData12(){return data12;}
  @Bindable
  public double getData13(){return data13;}
  @Bindable
  public double getData14(){return data14;}
  @Bindable
  public double getData20(){return data20;}
  @Bindable
  public double getData21(){return data21;}
  @Bindable
  public double getData22(){return data22;}
  @Bindable
  public double getData23(){return data23;}
  @Bindable
  public double getData24(){return data24;}
  @Bindable
  public double getData30(){return data30;}
  @Bindable
  public double getData31(){return data31;}
  @Bindable
  public double getData32(){return data32;}
  @Bindable
  public double getData33(){return data33;}
  @Bindable
  public double getData34(){return data34;}
  @Bindable
  public double getData100(){return data100;}
  @Bindable
  public double getData101(){return data101;}
  @Bindable
  public double getData102(){return data102;}
  @Bindable
  public double getData103(){return data103;}
  @Bindable
  public double getData110(){return data110;}
  @Bindable
  public double getData111(){return data111;}
  @Bindable
  public double getData112(){return data112;}
  @Bindable
  public double getData113(){return data113;}
  @Bindable
  public double getData120(){return data120;}
  @Bindable
  public double getData121(){return data121;}
  @Bindable
  public double getData122(){return data122;}
  @Bindable
  public double getData123(){return data123;}
  //
  public void setData00(double d){double dd = Double.isNaN(d) ? 0d : d;data00 = dd;setData02(sabun(data01 , data00));setData03(hiritsu(data02 , data04));}
  public void setData01(double d){double dd = Double.isNaN(d) ? 0d : d;data01 = dd;setData02(sabun(data01 , data00));setData03(hiritsu(data02 , data04));}
  public void setData02(double d){double dd = Double.isNaN(d) ? 0d : d;data02 = dd;notifyPropertyChanged(BR.data02);}
  public void setData03(double d){double dd = Double.isNaN(d) ? 0d : d;data03 = dd;notifyPropertyChanged(BR.data03);}
  public void setData04(double d){double dd = Double.isNaN(d) ? 0d : d;data04 = dd;setData03(hiritsu(data02 , data04));}
  public void setData10(double d){double dd = Double.isNaN(d) ? 0d : d;data10 = dd;setData12(sabun(data11 , data10));setData13(hiritsu(data12 , data14));}
  public void setData11(double d){double dd = Double.isNaN(d) ? 0d : d;data11 = dd;setData12(sabun(data11 , data10));setData13(hiritsu(data12 , data14));}
  public void setData12(double d){double dd = Double.isNaN(d) ? 0d : d;data12 = dd;notifyPropertyChanged(BR.data12);}
  public void setData13(double d){double dd = Double.isNaN(d) ? 0d : d;data13 = dd;notifyPropertyChanged(BR.data13);}
  public void setData14(double d){double dd = Double.isNaN(d) ? 0d : d;data14 = dd;setData13(hiritsu(data12 , data14));}
  public void setData20(double d){double dd = Double.isNaN(d) ? 0d : d;data20 = dd;setData12(sabun(data21 , data20));setData13(hiritsu(data22 , data24));}
  public void setData21(double d){double dd = Double.isNaN(d) ? 0d : d;data21 = dd;setData12(sabun(data21 , data20));setData13(hiritsu(data22 , data24));}
  public void setData22(double d){double dd = Double.isNaN(d) ? 0d : d;data22 = dd;notifyPropertyChanged(BR.data22);}
  public void setData23(double d){double dd = Double.isNaN(d) ? 0d : d;data23 = dd;notifyPropertyChanged(BR.data23);}
  public void setData24(double d){double dd = Double.isNaN(d) ? 0d : d;data24 = dd;setData13(hiritsu(data12 , data24));}
  public void setData30(double d){double dd = Double.isNaN(d) ? 0d : d;data30 = dd;setData12(sabun(data11 , data30));setData13(hiritsu(data32 , data34));}
  public void setData31(double d){double dd = Double.isNaN(d) ? 0d : d;data31 = dd;setData12(sabun(data11 , data30));setData13(hiritsu(data32 , data34));}
  public void setData32(double d){double dd = Double.isNaN(d) ? 0d : d;data32 = dd;notifyPropertyChanged(BR.data32);}
  public void setData33(double d){double dd = Double.isNaN(d) ? 0d : d;data33 = dd;notifyPropertyChanged(BR.data33);}
  public void setData34(double d){double dd = Double.isNaN(d) ? 0d : d;data34 = dd;setData13(hiritsu(data12 , data34));}
  //
  public void setData100(double d){double dd = Double.isNaN(d) ? 0d : d;data100 = dd;setData120(sabun(data110 , data100));}
  public void setData101(double d){double dd = Double.isNaN(d) ? 0d : d;data101 = dd;setData121(sabun(data111 , data101));}
  public void setData102(double d){double dd = Double.isNaN(d) ? 0d : d;data102 = dd;setData122(sabun(data112 , data102));}
  public void setData103(double d){double dd = Double.isNaN(d) ? 0d : d;data103 = dd;setData123(sabun(data113 , data103));}
  public void setData110(double d){double dd = Double.isNaN(d) ? 0d : d;data110 = dd;setData120(sabun(data110 , data100));}
  public void setData111(double d){double dd = Double.isNaN(d) ? 0d : d;data111 = dd;setData121(sabun(data111 , data101));}
  public void setData112(double d){double dd = Double.isNaN(d) ? 0d : d;data112 = dd;setData122(sabun(data112 , data102));}
  public void setData113(double d){double dd = Double.isNaN(d) ? 0d : d;data113 = dd;setData123(sabun(data113 , data103));}
  public void setData120(double d){double dd = Double.isNaN(d) ? 0d : d;data120 = dd;notifyPropertyChanged(BR.data120);}
  public void setData121(double d){double dd = Double.isNaN(d) ? 0d : d;data121 = dd;notifyPropertyChanged(BR.data121);}
  public void setData122(double d){double dd = Double.isNaN(d) ? 0d : d;data122 = dd;notifyPropertyChanged(BR.data122);}
  public void setData123(double d){double dd = Double.isNaN(d) ? 0d : d;data123 = dd;notifyPropertyChanged(BR.data123);}


  private double sabun(double d1 , double d2){
    double dSabun = 0d;
    dSabun = d1 - d2;
    return dSabun;
  }
  private double hiritsu(double d1 , double d2){
    double dHiritsu = 0d;
    dHiritsu = ((Double.isNaN(d2) || d2 == 0d) ? 0d : (d1 / d2 * 100));
    return dHiritsu;
  }
  ////CONVERTER
  public double stringToDouble(String s){
    double d = 0d;
    try {
      d = Double.parseDouble(s);
    }catch(Exception e){
      d = 0d;
      System.out.println(e.getStackTrace());
    }
    d = Double.isNaN(d) ? 0d : d;
    return d;
  }
  @InverseMethod("stringToDouble")
  public String doubleToString(double d){
    String s = "";
    d = Double.isNaN(d) ? 0d : d;
    s = String.format("%.2f" , d);
    return s;
  }
}
