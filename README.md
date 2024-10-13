# ATM Programı / ATM Program

[English version below](#english-version)

## Türkçe

Bu Java programı, basit bir ATM simülasyonu gerçekleştirir. Kullanıcılar bakiye sorgulama, para yatırma ve para çekme işlemlerini gerçekleştirebilirler.

### Özellikler

- Bakiye sorgulama
- Para yatırma
- Para çekme
- Çıkış yapma

### Nasıl Çalışır

1. Program başladığında, kullanıcıya bir başlangıç bakiyesi (1000 TL) atanır.
2. Kullanıcıya bir işlem menüsü sunulur.
3. Kullanıcı, yapmak istediği işlemi seçer.
4. Program, seçilen işlemi gerçekleştirir ve sonucu ekrana yazdırır.
5. İşlem tamamlandıktan sonra, program ana menüye döner.
6. Kullanıcı çıkış yapmayı seçene kadar program çalışmaya devam eder.

### Nasıl Kullanılır

1. Sisteminizde Java'nın kurulu olduğundan emin olun.
2. Java dosyasını derleyin:
   ```
   javac ATMProgrami.java
   ```
3. Programı çalıştırın:
   ```
   java ATMProgrami
   ```
4. Ekrandaki talimatları takip ederek işlemlerinizi gerçekleştirin.

### Örnek Kullanım

```
Lütfen yapmak istediğiniz işlemi seçiniz:
1. Bakiye sorgulama
2. Para yatırma
3. Para çekme
4. Çıkış
1
Bakiyeniz: 1000.0 TL

Lütfen yapmak istediğiniz işlemi seçiniz:
1. Bakiye sorgulama
2. Para yatırma
3. Para çekme
4. Çıkış
2
Yatırmak istediğiniz miktarı giriniz: 
500
500.0 TL yatırıldı. Yeni bakiyeniz: 1500.0 TL

Lütfen yapmak istediğiniz işlemi seçiniz:
1. Bakiye sorgulama
2. Para yatırma
3. Para çekme
4. Çıkış
4
Çıkış yapılıyor...
```

### Katkıda Bulunma

Bu projeyi fork edip geliştirmeler yapabilirsiniz. Örneğin, kullanıcı doğrulama, farklı hesaplar arası transfer gibi özellikler ekleyebilirsiniz.

### Lisans

Bu proje açık kaynaklıdır ve [MIT Lisansı](https://opensource.org/licenses/MIT) altında kullanıma sunulmuştur.

---

## English Version

This Java program simulates a simple ATM. Users can check their balance, deposit money, and withdraw money.

### Features

- Balance inquiry
- Money deposit
- Money withdrawal
- Exit

### How It Works

1. When the program starts, the user is assigned an initial balance (1000 TL).
2. The user is presented with an operation menu.
3. The user selects the desired operation.
4. The program performs the selected operation and prints the result.
5. After the operation is completed, the program returns to the main menu.
6. The program continues to run until the user chooses to exit.

### How to Use

1. Ensure you have Java installed on your system.
2. Compile the Java file:
   ```
   javac ATMProgrami.java
   ```
3. Run the program:
   ```
   java ATMProgrami
   ```
4. Follow the on-screen instructions to perform your transactions.

### Example Usage

```
Lütfen yapmak istediğiniz işlemi seçiniz: (Please select the operation you want to perform:)
1. Bakiye sorgulama (Balance inquiry)
2. Para yatırma (Deposit money)
3. Para çekme (Withdraw money)
4. Çıkış (Exit)
1
Bakiyeniz: 1000.0 TL (Your balance: 1000.0 TL)

Lütfen yapmak istediğiniz işlemi seçiniz: (Please select the operation you want to perform:)
1. Bakiye sorgulama (Balance inquiry)
2. Para yatırma (Deposit money)
3. Para çekme (Withdraw money)
4. Çıkış (Exit)
2
Yatırmak istediğiniz miktarı giriniz: (Enter the amount you want to deposit:)
500
500.0 TL yatırıldı. Yeni bakiyeniz: 1500.0 TL (500.0 TL deposited. Your new balance: 1500.0 TL)

Lütfen yapmak istediğiniz işlemi seçiniz: (Please select the operation you want to perform:)
1. Bakiye sorgulama (Balance inquiry)
2. Para yatırma (Deposit money)
3. Para çekme (Withdraw money)
4. Çıkış (Exit)
4
Çıkış yapılıyor... (Exiting...)
```

### Note

The program output is in Turkish. English translations are provided in parentheses in the example usage section above.

### Contributing

Feel free to fork this project and make improvements. For example, you could add features like user authentication or transfers between different accounts.

### License

This project is open source and available under the [MIT License](https://opensource.org/licenses/MIT).
