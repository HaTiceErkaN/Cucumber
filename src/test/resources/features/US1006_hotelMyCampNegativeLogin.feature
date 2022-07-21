
# hotelmycamp sitesinde 3 adet negative test yapalim
  #1- dogru usernam, yanlis password
  #2- yanlis usernam, dogru password
  #3- yanlis usernam, yanlis password

  Feature: US1006 yanlis bilgilerle siteye giris yapilamaz

    Scenario: TC09 yanlis password ile giris
      Given kullanici "HMCUrl" anasayfasinda
      Then Log in yazisina tiklar
      And gecerli username girer
      And gecersiz password girer
      And Login butonuna basar
      Then sayfaya giris yapilamadigini kontrol eder
      Then kullanici 5 sn bekler
      And sayfayi kapatir

    Scenario: TC09 yanlis password ile giris yapilamaz
      Given kullanici "HMCUrl" anasayfasinda
      Then Log in yazisina tiklar
      And gecersiz username girer
      And gecerli password girer
      And Login butonuna basar
      Then sayfaya giris yapilamadigini kontrol eder
      Then kullanici 5 sn bekler
      And sayfayi kapatir

    Scenario: TC10 yanlis password ve yanlis sifre ile giris yapilamaz
      Given kullanici "HMCUrl" anasayfasinda
      Then Log in yazisina tiklar
      And gecersiz username girer
      And gecersiz password girer
      And Login butonuna basar
      Then sayfaya giris yapilamadigini kontrol eder
      Then kullanici 5 sn bekler
      And sayfayi kapatir

