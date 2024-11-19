## **Test Checklist**

### **1. General Information**
- **Branch Name**: `<Branch Name>` (e.g., `cse-2947`)

| **showAwardItems** | **Data**                                                                                          |
|---------------------|---------------------------------------------------------------------------------------------------|
| **false**           | `32432844-789.json`, `41008579-789.json`, `69649212-789.json`, `245087857-789.json`, `245087925-789.json` |
| **true**            | `39778655-589.json`, `39778838-589.json`, `150158831-589.json`, `210766127-589.json`, `245024354-589.json`, `245285503-589.json` |
| **null**            | `39778655-689.json`, `39778838-689.json`, `39780265-689.json`, `150158831-689.json`, `210766127-689.json`, `245024354-689.json`, `245285503-689.json` |

---

### **2. API Response Pre-Checks**
- [ ] **Example Curl Validation from the MR**
  - By making a sample request with **storeId: 284**:
    - Checked that the response returned 200.
    - Confirmed that the `promotion` and `showAwardItems` fields are present in the response.
    - Verified that `promotion.id`, `promotion.shortName`, and `promotion.showAwardItems` have the expected values.
      
#### Sample Curl:
```bash
curl --location 'http://discovery-search-grocery-search-service.stage.tgointernals.com/search?searchQuery=tum--urunler%3Fq%3Ds%C3%BCt&searchQueryTypes=PRODUCT&storeIds=284' \
--header 'x-agentname: agent' \
--header 'x-correlationId: 123456' \
--header 'branch-name: cse-2947' \
--data
```

### **3. API Functional Tests**

#### **Promotion Field Validations**
- **promotion.id** validated. (Example: `65877969`)
- **promotion.shortName** values checked. (Example: `Buy More Pay Less`)
- **promotion.showAwardItems** field validated based on the condition:
  - **showAwardItems: true** -> `*-589.json` files
  - **showAwardItems: false** -> `*-789.json` files
  - **showAwardItems: null** -> `*-689.json` files

#### **WidgetPromoShortName Compatibility Checks**
- **widgetPromoShortName** field checked for compatibility between the old and new code.

---

### **4. Automation Tests**

#### **Automation Test Coverage**
- All **promotion** fields (**id**, **shortName**, **showAwardItems**) were tested.
- Automation tests were written for **GrocerySearch** and **GroceryCategoryDetail** endpoints.
- Automation tests covered:
  - **showAwardItems**: `true`, `false`, and `null` conditions were validated.
  - **promotion.id** and **promotion.shortName** values were compared.
