# NanasDrama

Aplikasi Android native (Java) untuk katalog drama dari backend konten yang Anda miliki atau lisensikan. Proyek ini tidak menyimpan token/API key dan tidak memuat scraper atau stream situs pihak ketiga.

## Build lokal

Buka di Android Studio, lalu jalankan varian `debug` pada perangkat Android 7.0 (API 24) atau lebih baru.

## Rilis GitHub

Push tag `v1.0.0` untuk menjalankan workflow rilis. Sebelum itu tambahkan empat GitHub Actions secrets berikut: `NANASDRAMA_KEYSTORE_BASE64`, `NANASDRAMA_KEYSTORE_PASSWORD`, `NANASDRAMA_KEY_ALIAS`, dan `NANASDRAMA_KEY_PASSWORD`. APK release hanya diterbitkan bila sudah ditandatangani.
