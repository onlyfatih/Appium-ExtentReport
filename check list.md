## **Test Kontrol Listesi**

### **1. Genel Hazırlık**
- [ ] **Branch Kontrolü**
  - Branch adı doğru mu? (**cse-2947** kontrol edildi)
- [ ] **Ortam Kontrolü**
  - Testler doğru ortamda çalıştırıldı mı? (**Stage** ortamında çalıştırıldı)
  - Uç noktalar erişilebilir mi? (Erişim başarılı: `http://discovery-search-grocery-search-service.stage.tgointernals.com/search`)
- [ ] **Veri Doğrulama**
  - Test için doğru veriler hazırlandı mı?

| **showAwardItems** | **Dosyalar**                                                                 |
|---------------------|-----------------------------------------------------------------------------|
| **false**           | 32432844-789.json, 41008579-789.json, 69649212-789.json, 245087857-789.json, 245087925-789.json |
| **true**            | 39778655-589.json, 39778838-589.json, 150158831-589.json, 210766127-589.json, 245024354-589.json, 245285503-589.json |
| **null**            | 39778655-689.json, 39778838-689.json, 39780265-689.json, 150158831-689.json, 210766127-689.json, 245024354-689.json, 245285503-689.json |

---

### **2. API Yanıt Ön Kontrolleri**
- [ ] **MR'da Verilen Örnek Curl Doğrulaması**
  - **storeId: 284** ile örnek bir istek yapılarak:
    - Yanıtın 200 döndüğü kontrol edildi.
    - Yanıtta `promotion` ve `showAwardItems` alanlarının geldiği doğrulandı.
    - `promotion.id`, `promotion.shortName`, ve `promotion.showAwardItems` alanlarının beklenen değerlere sahip olduğu kontrol edildi.

#### Örnek Curl:
```bash
curl --location 'http://discovery-search-grocery-search-service.stage.tgointernals.com/search?searchQuery=tum--urunler%3Fq%3Ds%C3%BCt&searchQueryTypes=PRODUCT&storeIds=284' \
--header 'x-agentname: agent' \
--header 'x-correlationId: 123456' \
--header 'branch-name: cse-2947' \
--data '''

### **3. API Fonksiyonel Testleri**

#### **Promotion Alanı Kontrolleri**
- [ ] **promotion.id** doğrulandı. (Örnek: `65877969`)
- [ ] **promotion.shortName** değerleri kontrol edildi. (Örnek: `Çok Al Az Öde`)
- [ ] **promotion.showAwardItems** alanı duruma göre doğrulandı:
  - **showAwardItems: true** -> `*-589.json` dosyaları
  - **showAwardItems: false** -> `*-789.json` dosyaları
  - **showAwardItems: null** -> `*-689.json` dosyaları

#### **WidgetPromoShortName Uyumluluk Kontrolleri**
- [ ] **widgetPromoShortName** alanı eski ve yeni kod arasında uyumlu kontrol edildi.

---

### **4. Otomasyon Testleri**

#### **Otomasyon Test Kapsamı**
- [ ] Tüm **promotion** alanları (**id**, **shortName**, **showAwardItems**) test edildi.
- [ ] **GrocerySearch** ve **GroceryCategoryDetail** endpoint'leri için otomasyon testleri yazıldı.
- [ ] Otomasyon testlerinde kullanılan:
  - **showAwardItems**: `true`, `false`, ve `null` durumları kontrol edildi.
  - **promotion.id** ve **promotion.shortName** değerleri karşılaştırıldı.
