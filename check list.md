## **Test Kontrol Listesi**
## **MR Template**

### **1. General Information**
- **Branch Name**: `<Branch Name>` (e.g., `cse-2947`)
- **Environment**: `<Environment>` (e.g., `Stage`)

---

### **2. Data Validation**

| **showAwardItems** | **Data**                                                                                          |
|---------------------|---------------------------------------------------------------------------------------------------|
| **false**           | `32432844-789.json`, `41008579-789.json`, `69649212-789.json`, `245087857-789.json`, `245087925-789.json` |
| **true**            | `39778655-589.json`, `39778838-589.json`, `150158831-589.json`, `210766127-589.json`, `245024354-589.json`, `245285503-589.json` |
| **null**            | `39778655-689.json`, `39778838-689.json`, `39780265-689.json`, `150158831-689.json`, `210766127-689.json`, `245024354-689.json`, `245285503-689.json` |

---

### **3. Sample API Request**

#### Sample Curl:
```bash
curl --location 'http://<API_ENDPOINT>/search?searchQuery=<QUERY>&searchQueryTypes=PRODUCT&storeIds=<STORE_ID>' \
--header 'x-agentname: <AGENT_NAME>' \
--header 'x-correlationId: <CORRELATION_ID>' \
--header 'branch-name: <BRANCH_NAME>' \
--data ''
```

### **3. API Fonksiyonel Testleri**

#### **Promotion Alanı Kontrolleri**
- [ ] **promotion.id** doğrulandı. (Örnek: `65877969`)
- [ ] **promotion.shortName** değerleri kontrol edildi. (Örnek: `Çok Al Az Öde`)
- [ ] **promotion.showAwardItems** alanı duruma göre doğrulandı:
  - **showAwardItems: true** -> `*-589.json` dosyaları
  - **showAwardItems: false** -> `*-789.json` dosyaları
  - **showAwardItems: false** -> `*-689.json` dosyaları

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
