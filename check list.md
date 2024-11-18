## **Test Kontrol Listesi**

### **1. Genel Hazırlık**
- [ ] **Branch Kontrolü**
  - Branch adı doğru mu?
- [ ] **Ortam Kontrolü**
  - Testler doğru ortamda çalıştırıldı mı?
  - Uç noktalar erişilebilir mi?
- [ ] **Veri Doğrulama**
  - Test için doğru veriler hazırlandı mı?

---

### **2. API Fonksiyonel Testleri**
- [ ] **Promotion Alanı Kontrolleri**
  - `promotion.id` doğrulandı.
  - `promotion.shortName` değerleri kontrol edildi.
  - `promotion.showAwardItems` alanı doğrulandı.
- [ ] **WidgetPromoShortName Uyumluluk Kontrolleri**
  - Geriye dönük uyumluluk kontrolü yapıldı.

---

### **3. Endpoint Testleri**
#### **3.1 GrocerySearch Endpoint**
- [ ] **API Yanıtları**
  - Endpoint'ten dönen yanıtlar kontrol edildi.
  - `promotion` ve `showAwardItems` alanları kontrol edildi.

#### **3.2 GroceryCategoryDetail Endpoint**
- [ ] **Kategori Verileri**
  - Kategorilerdeki tüm ürünler için `promotion` doğrulandı.

---

### **4. Otomasyon Testleri**
- [ ] **Otomasyon Test Kapsamı**
  - Tüm `promotion` alanları test edildi.
- [ ] **Negatif Senaryolar**
  - Eksik veya hatalı veri senaryoları test edildi.

