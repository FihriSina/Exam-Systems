#  Sınav Sistemi Projesi

Bu proje, öğrenci ve eğitmen rollerini barındıran, kullanıcıların sınavlara katılabildiği ve yöneticilerin sınavları, soruları ve kullanıcıları yönetebildiği kapsamlı bir sınav otomasyon sistemidir. Eğitim odaklı platformlarda kullanılabilecek temel bir altyapı sunar.

Projeyi YouTube üzerinde izlediğim bir eğitim serisinden ilham alarak sıfırdan kendi elimle kodladım. Kaynak kod paylaşımı yapılmadığı için videoları izleyerek mantığını kavrayıp, tüm kodları bireysel olarak yazdım.

 Kaynak aldığım YouTube oynatma listesi: [YouTube Eğitim Serisi](https://www.youtube.com/playlist?list=PLdRq0mbeEBmw2W6mXcMkWS8EpH-3HEyyZ)

---

##  Kullanılan Teknolojiler

- **C#** ile masaüstü uygulama geliştirme
- **Windows Forms** kullanıcı arayüzü
- **SQL Server** veritabanı yönetimi
- **ADO.NET / Entity Framework** ile veri erişimi

---

##  Kullanıcı Rolleri

🔹 **Öğrenci:**
- Sınavlara katılabilir  
- Sınav sonuçlarını görüntüleyebilir  

🔹 **Yönetici (Admin):**
- Kullanıcı yönetimi (ekleme, silme, düzenleme)  
- Soru bankası oluşturma  
- Yeni sınavlar düzenleme ve sınavlara soru atama  
- Sınav sonuçlarını inceleyebilme  

---

##  Proje Özellikleri

✅ Kullanıcı Kayıt ve Giriş Sistemi  
✅ Sınav Oluşturma ve Soru Tanımlama  
✅ Çoktan Seçmeli Soru Desteği  
✅ Sınava Katılım ve Gerçek Zamanlı Değerlendirme  
✅ Detaylı Sınav Sonuçları ve Skor Raporlama  
✅ Yönetici Paneli ile Tam Kontrol  

---

##  Kurulum ve Çalıştırma

1. Bu repoyu klonlayın:
   ```bash
   git clone https://github.com/FihriSina/Exam-Systems.git

2. Visual Studio ile açın.
 
3. SQL Server’da SinavSistemi adında bir veritabanı oluşturun.
 
4. app.config veya settings.cs içinden bağlantı dizesini (connection string) kendi sunucunuza göre güncelleyin.
 
5. Gerekli NuGet paketlerini yükleyin (örneğin: System.Data.SqlClient, EntityFramework vb.)
 
6. Uygulamayı başlatın ve keşfetmeye başlayın!

 Neden Bu Proje?
Bu proje, yazılım geliştirme pratiği kazanmak, veri tabanı ve kullanıcı arayüzü etkileşimini pekiştirmek ve gerçek bir kullanım senaryosu üzerinde çalışmak amacıyla geliştirilmiştir. Özellikle sınav sistemleri gibi çok katmanlı yapılar üzerinde çalışmak isteyen geliştiriciler için faydalı bir örnektir.

 Lisans
Bu proje tamamen öğrenme amaçlı geliştirilmiştir. Ticari amaçla kullanılmaması rica olunur.
