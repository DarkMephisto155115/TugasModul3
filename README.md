# (English)
# PPh (Pajak Penghasilan) Calculator

This is a simple Java program that calculates PPh (Pajak Penghasilan) based on the user's input. PPh is the income tax in Indonesia. The program takes into account the user's gross monthly income, monthly dependents, marital status, and the number of children. It then calculates the annual income, taxable income, and the amount of income tax owed.

## How to Use

To use the program, follow these steps:

1. Compile the Java code to create an executable class file.

2. Run the program.

3. You will be prompted to enter the following information:
    - Monthly Gross Income (in millions): Enter your monthly gross income.
    - Monthly Dependents (in millions): Enter the monthly expenses for your dependents.
    - Marital Status: Enter 1 if you are married, 2 if you are single.
    - Number of Children: If you have children, enter the number of children; otherwise, enter 0.

4. The program will then display the following information:
    - Monthly Gross Income
    - Monthly Dependents
    - Annual Gross Income
    - Annual Dependents
    - Net Income
    - Tax-Free Income (PTKP)
    - Taxable Income (PKP)
    - Tax Rate
    - Income Tax Owed

## Example Usage

Here's an example of how to use the program:

```
==================================
		   Kalkulator
   PPh (Pajak Penghasilan)
==================================
Masukkan Penghasilan per-bulan (Juta) : 20
Masukkan Tanggungan per-bulan (Juta) : 5
Sudah menikah?
1. Sudah
2. Belum
===========
1
Punya anak?
1. Punya
2. Tidak punya
===========
1
Berapa jumlah anak: 2

Gaji Perbulan : 20.0 Juta
Tanggungan Perbulan : 5.0 Juta
Gaji Pertahun : 240.0 Juta
Tanggungan Pertahun : 60.0 Juta
Penghasilan bersih : 240.0 Juta - 60.0 Juta = 180.0 Juta
Penghasilan tidak kena pajak(PTKP) : Sudah menikah dan 2 Anak = 63.0 Juta
Penghasilan kena pajak (PKP) : 180.0 Juta - 63.0 Juta = 117.0 Juta
Persentase PPh : 15
Pajak PPh : 17.55 Juta

Total pajak yang harus dibayarkan adalah Rp. 17.55 Juta
```

## Class Structure

The program is structured as follows:

- The `Main` class contains the main method to run the program. It collects user input and uses the `hitungPPh` class to calculate and display PPh information.

- The `hitungPPh` class is responsible for performing PPh calculations. It has various methods to calculate the taxable income, tax rates, and income tax owed. The final PPh information is displayed in the `DisplayPPh` method.

Feel free to use and modify this code for your tax calculations
#

# (Indonesia)

# Kalkulator PPh (Pajak Penghasilan)

Ini adalah program sederhana yang ditulis dalam bahasa Java dan digunakan untuk menghitung PPh (Pajak Penghasilan) berdasarkan masukan pengguna. Program mempertimbangkan pendapatan kotor bulanan, tanggungan bulanan, status perkawinan, dan jumlah anak pengguna. Selanjutnya, program menghitung pendapatan tahunan, pendapatan kena pajak, dan jumlah pajak yang harus dibayar.

## Cara Menggunakan

Untuk menggunakan program ini, ikuti langkah-langkah berikut:

1. Kompilasi kode Java untuk membuat file kelas yang dapat dijalankan.

2. Jalankan program.

3. Anda akan diminta untuk memasukkan informasi berikut:
    - Pendapatan Kotor Bulanan (dalam jutaan): Masukkan pendapatan kotor bulanan Anda.
    - Tanggungan Bulanan (dalam jutaan): Masukkan biaya bulanan untuk tanggungan Anda.
    - Status Perkawinan: Masukkan 1 jika Anda sudah menikah, 2 jika Anda belum menikah.
    - Jumlah Anak: Jika Anda memiliki anak, masukkan jumlah anak; jika tidak, masukkan 0.

4. Program akan menampilkan informasi berikut:
    - Pendapatan Kotor Bulanan
    - Tanggungan Bulanan
    - Pendapatan Kotor Tahunan
    - Tanggungan Tahunan
    - Pendapatan Bersih
    - Pendapatan Bebas Pajak (PTKP)
    - Pendapatan Kena Pajak (PKP)
    - Tarif Pajak
    - Jumlah Pajak yang Harus Dibayar

## Contoh Penggunaan



```
==================================
          Kalkulator
     PPh (Pajak Penghasilan)
==================================
Masukkan Pendapatan per Bulan (Juta) : 20
Masukkan Biaya Tanggungan per Bulan (Juta) : 5
Sudah menikah?
1. Sudah
2. Belum
===========
1
Punya anak?
1. Punya
2. Tidak punya
===========
1
Berapa jumlah anak: 2

Pendapatan Perbulan : 20.0 Juta
Biaya Tanggungan Perbulan : 5.0 Juta
Pendapatan Pertahun : 240.0 Juta
Biaya Tanggungan Pertahun : 60.0 Juta
Pendapatan Bersih : 240.0 Juta - 60.0 Juta = 180.0 Juta
Pendapatan Bebas Pajak (PTKP) : Sudah menikah dan 2 Anak = 63.0 Juta
Pendapatan Kena Pajak (PKP) : 180.0 Juta - 63.0 Juta = 117.0 Juta
Tarif Pajak PPh : 15
Pajak PPh : 17.55 Juta

Total pajak yang harus dibayarkan adalah Rp. 17.55 Juta
```

## Struktur Kelas


- Kelas `Main` berisi metode utama untuk menjalankan program. Kelas ini digunakan untuk menerima masukan pengguna dan menggunakan kelas `hitungPPh` untuk menghitung dan menampilkan informasi PPh.

- Kelas `hitungPPh` bertanggung jawab untuk melakukan perhitungan PPh. Kelas ini memiliki berbagai metode untuk menghitung pendapatan kena pajak, tarif pajak, dan jumlah pajak yang harus dibayar. Informasi PPh akhir ditampilkan dalam metode `DisplayPPh`.

Silahkan bebas menggunakan dan memodifikasi kode ini untuk perhitungan pajak