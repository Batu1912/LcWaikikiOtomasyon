Feature: Purchase

  Scenario: Purchase Case 1
    Given Uygulama acilir
    When Arama cubuguna "Kadın spor ayakkabı" yazilir
    When Ara butonuna tiklanir
    Then Urunlerin listelendigi kontrol edilir
    When 1 siradaki urune tiklanir
    Then Product Pagein acildigi kontrol edilir
    When Urun bedeni secilir
    When Sepete ekleye tiklanir
    When Sepete eklenen urun sayisinin 1 oldugu kontrol edilir
    Then Sepet detaylarina tıklanir
    When Sepetim sayfasina gidilir
    Then Sepetteki urun bedeninin 40 oldugu kontrol edilir
    Then Odeme adimi butonunu gorunur