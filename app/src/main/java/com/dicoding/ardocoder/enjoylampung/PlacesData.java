package com.dicoding.ardocoder.enjoylampung;

import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class PlacesData {
    private static String[] placeNames = {
            "Pantai Pasir Putih",
            "Teluk Kiluan",
            "Taman Nasional Way Kambas",
            "Pulau Tegal Mas",
            "Danau Ranau",
            "Pantai Tanjung Setia",
            "Gunung Anak Krakatau",
            "Air Terjun Putri Malu",
            "Bukit Pangonan",
            "Pulau Tangkil",
            "Taman Batu Granit Tanjung Bintang",
            "Goa Minang Rua",
            "Pantai Gigi Hiu",
            "Kawah Keramikan Suoh",
            "Taman Purbakala Pugung Raharjo",
            "Curup Gangsa",
            "Pulau Mengkudu",
            "Menara Siger",
            "Taman Wisata Lembah Hijau",
            "Pantai Dewi Mandapa",
            "Bendungan Margotirto",
            "Muncak Teropong Laut",
            "Taman Kupu-Kupu Gita Persada",
            "Kebun Karet Trikora",
            "Mata Air Way Sumpuk",
            "Puncak Mas"
    };

    private static int[] placeImages = {
            R.drawable.pantai_pasirputih,
            R.drawable.teluk_kiluan,
            R.drawable.tamannasional_waykambas,
            R.drawable.pulau_tegalmas,
            R.drawable.danau_ranau,
            R.drawable.pantai_tanjungsetia,
            R.drawable.gunung_anakkrakatau,
            R.drawable.airterjun_putrimalu,
            R.drawable.bukit_pangonan,
            R.drawable.pulau_tangkil,
            R.drawable.tamanbatugranit_tanjungbintang,
            R.drawable.goa_minangrua,
            R.drawable.pantai_gigihiu,
            R.drawable.kawah_keramikansuoh,
            R.drawable.tamanpurbakala_pugungraharjo,
            R.drawable.curup_gangsa,
            R.drawable.pulau_mengkudu,
            R.drawable.menara_siger,
            R.drawable.tamanwisata_lembahhijau,
            R.drawable.pantai_dewimandapa,
            R.drawable.bendungan_margotirto,
            R.drawable.muncak_teroponglaut,
            R.drawable.tamankupukupu_gitapersada,
            R.drawable.kebunkaret_trikora,
            R.drawable.mataair_waysumpuk,
            R.drawable.puncak_mas
    };

    private static String[] placeDetail = {
            "Pantai ini tengah jadi destinasi wisata hits di Lampung. Selain pasir putihnya yang terkenal, pantai ini juga menawarkan berbagai panorama indah lainnya yang dapat dinikmati, baik untuk beraktivitas maupun sekedar bersantai.",
            "Teluk Kiluan terkenal di kalangan wisatawan karena disini kamu bisa melihat langsung ikan lumba-lumba. Tidak hanya itu, wisatawan bahkan bisa berenang langsung di laut bersama mereka! Di tujuan wisata alam Lampung ini, Anda bisa memanfaatkan Kamera Underwater untuk mengambil momen-momen terbaik bersama teman dan keluarga!",
            "Pusat konservasi besar ini menampung setidaknya 300 ekor gajah dan sampai saat ini terus bertambah. Pengunjung Way Kambas bisa melihat, bahkan berinteraksi langsung dengan gajah. Selain gajah, terdapat hewan-hewan lain seperti harimau dan beruang yang bisa ditemui di tempat wisata Bandar Lampung favorit ini. Untuk yang ingin berfoto, sebaiknya menggunakan Lensa kamera jarak jauh.",
            "Pulau Tegal Mas merupakan pulau yang dikembangkan sebagai destinasi wisata andalan baru di Lampung. Tak kalah dengan pulau dan pantai eksotis di Bali, pasir putih, birunya laut, serta cottage dan vila bergaya tropical mewarnai Pulau Tegal Mas. Beragam kegiatan air yang bisa kamu lakukan di sana, seperti snorkeling hingga bermain kano. Liburan jadi makin menyenangkan",
            "Danau Ranau merupakan danau terbesar ke-2 di Pulau Sumatera. Wisata air Danau Ranau menyimpan segudang atraksi, mulai dari pemandangan Gunung Seminung hingga Pulau Marisa yang berada tepat di tengah-tengah danau.",
            "Untuk wisatawan yang suka menantang ombak, pantai Tanjung Setia adalah objek wisata di Lampung yang sangat cocok untuk membuktikan skill berselancar. Selain ombak yang kuat, fasilitas penginapan disini juga sudah tersedia lengkap.",
            "Tentu semua tahu soal gunung aktif yang terkenal berbahaya ini. Namun, siapa sangka, ternyata Gunung Anak Krakatau merupakan salah satu tujuan wisata unggulan Lampung. Wisata Krakatau menyediakan berbagai aktivitas seru seperti trekking hingga snorkeling.",
            "Nama air terjun ini berasal dari bentuk arus airnya yang menyerupai punggung perempuan. Air terjun yang terletak di tengah hutan tropis ini dapat menjadi spot foto yang pas, dengan latar belakang keindahan alam air terjun dan hutan sekitarnya. Objek wisata populer di Lampung ini juga tergolong salah satu tempat yang instagramable.",
            "Bukit Pangonan tidak hanya menawarkan pemandangan asri ala pepohonan hijau. Pihak pengelola juga terus mengembangkan berbagai atraksi, seperti spot-spot berfoto dengan background titian hati yang terbuat dari susunan bunga dan tatanan lanskap yang unik. Bukit Pangonan cocok bagi kaum muda yang gemar swafoto.",
            "Pulau Tangkil menjadi satu-satunya spot wisata di Lampung yang menawarkan sensasi menguji adrenalin lewat aktivitas seru di air, mulai dari banana boat, flying fish, snorkeling, kano, jetski, glass bottom dan parasailing.",
            "Pelancong yang akan berkunjung ke sini wajib membawa peralatan merekamnya seperti kamera GoPro. Betapa tidak, formasi batunya yang keren nan unik ini sangat instagrammable! Masuk ke Taman Batu ini kita terasa disuguhkan panorama bebatuan ala Afrika, lengkap dengan panorama hutan karet di sekitarnya.",
            "Kabupaten Lampung Selatan jadi gudangnya wisata pantai indah, seperti salah satunya Pantai Minang Rua. Salah satu daya tarik yang ada di sana bukan hanya garis pantainya, bukit batu, dan gua juga menambah wibawa pantai ini.",
            "Nama pantai ini berasal dari keberadaan formasi bebatuan yang unik, saling menjulang ke atas bak gigi ikan hiu yang runcing. Di Pantai Gigi Hiu, para pelancong bisa asyik berfoto ria dengan latar belakang yang sangat jarang ditemui ini.",
            "Dengan banyaknya pegunungan di Pulau Sumatera, tidak mengherankan bila di wilayahnya yang paling selatan ini, terdapat kawah yang sangat cantik. Kawah Keramikan Suoh sekilas terlihat menantang, namun panorama alam dari objek wisata di Lampung satu ini sangat luar biasa indah sehingga membuat segalanya terasa sebanding.",
            "Lampung merupakan daerah yang kaya akan warisan sejarah, khususnya dari masa megalitik. Di taman inilah tersimpan berbagai situs historis tak bernilai, mulai dari punden berundak hingga benteng primitif. Pengunjung destinasi wisata sejarah Lampung ini akan mendapatkan banyak sekali ilmu mengenai sejarah masyarakat Lampung.",
            "Curup Gangsa adalah tempat wisata di Lampung selanjutnya yang menawarkan pesona air terjun dengan formasi bebatuan unik di bawahnya. Selain curupnya sendiri, di sekitar sini juga terdapat panorama lahan padi berundak dan atraksi kebudayaan seperti rumah adat khas setempat.",
            "Pulau Mengkudu belakangan tengah naik daun sebagai destinasi wisata provinsi Lampung. Pasalnya, pulau ini menjadi ciri khas tersendiri di Lampung karena kondisinya yang menyerupai Tanah Lot di Bali. Di antara atraksi unik di Pulau Mengkudu adalah Batu Lapis dan Pasir Timbul yang kian mempercantik panorama Pulau Mengkudu.",
            "Jika destinasi-destinasi sebelumnya lebih berfokus pada wisata alam Lampung, maka Menara Siger menjadi jawaban Lampung di bidang monumen. Menara Siger tidak kalah kerennya dengan Monas di Jakarta ataupun Gedung Sate di Bandung. Corak mahkota Sigernya dibuat sebagai simbol atas Balaputra Dewa, seorang raja sakti dari Sekala.",
            "Taman wisata ini menjual konsep wisata dengan orientasi pelestarian alam. Para pengunjung dapat belajar banyak soal pengetahuan lingkungan. Selain itu, taman ini dilengkapi berbagai fasilitas penunjang yang siap memanjakan para pelancong.",
            "Lampung memang terkenal dengan keindahan alam, terutama pantainya. Salah satu yang jadi andalan adalah Pantai Dewi Mandapa. Bukan cuma hamparan pasir putih beserta ombaknya yang bakal memanjakanmu, terdapat pula beberapa spot wisata lain yang bisa kamu jamah. Misalnya seperti Pulau Cinta dan Dermaga Asmara. Kamu akan menemukan dermaga kayu dengan pondok-pondok kecil, ayunan, dan properti untuk berswafoto.",
            "Bendungan di daerah Gisting ini sebenarnya adalah bangunan sisa pemerintahan kolonial Belanda yang dibangun sekitar tahun 1930-an. Bendungan Margo Tirto sempat viral di media sosial, karena foto permukaan air yang menampakkan tanaman air di dalamnya. Kini tempat yang dinamai Kampung Air Margotirto ini berubah menjadi tempat wisata dan dilengkapi kolam panjang berukuran 80x30 meter hingga sepeda bebek kayuh.",
            "Muncak Teropong Laut memungkinkan kamu menikmati keindahan Teluk Lampung beserta perkotaan dari atas ketinggian. Birunya laut dan sejumlah pulau kecil akan menjadi latar berfoto yang kian indah seiring datangnya senja. Ada sejumlah gardu berbentuk unik yang bisa kamu gunakan untuk berfoto. Sekilas, tempat ini terlihat seperti versi mininya The Lodge Maribaya, Bandung.",
            "Taman yang berdiri sejak 1997 ini merupakan salah satu destinasi wisata wajib di Lampung. Taman Kupu-Kupu Gita Persada menawarkan berbagai fasilitas lengkap seperti rumah pohon, tempat bermain anak, museum, maupun spot-spot swafoto yang keren.",
            "Perkebunan Karet Trikora yang ada di Lampung Selatan ini katanya mirip banget dengan pemandangan di Korea Selatan. Pohon-pohon karet di kanan dan kiri jalan saling bertautan, membentuk terowongan alami yang keren dan Instagramable. ",
            "Mata Air Way Sumpuk mulai hits pada akhir 2016 lalu sebagai salah satu spot foto underwater yang murah meriah, tapi hasilnya tetap oke. Tempat ini memang tidak luas, tapi airnya sangat jernih, sehingga cocok buat yang ingin berfoto di dalam air. ",
            "Salah satu yang jadi ciri khas adalah banyak rumah pohon beraneka ukuran di sana, mulai dari yang kecil hingga rumah pohon dua tingkat. Bahkan terdapat pula musala yang terletak di atas pohon. Selain foto-foto, kamu bisa juga menjajal wahana sepeda gantung yang tentunya bisa memacu adrenalin. Untuk ukuran wisata baru yang buka pada 2017 lalu, fasilitasnya sudah cukup lengkap. "
    };

    private static String[] placeHTM = {
            "Rp 20.000",
            "Rp 5.000",
            "Rp 7.000",
            "Rp 25.000 per orang,\n" +
                    "belum termasuk sewa alat.",
            "Dewasa Rp 50.000,\n" +
                    "Anak-anak Rp 30.000",
            "Gratis",
            "Gratis,\n" +
                    "sewa ranger Rp. 50.000",
            "Rp 10.000",
            "Rp 3.000",
            "Rp 5.000",
            "Gratis",
            "Rp 10.000 (motor),\n" +
                    "Rp 20.000 (mobil).",
            "Gratis",
            "Gratis,\n" +
                    "biaya motor trail\n" +
                    "Rp 50.000–Rp 100.000",
            "Gratis",
            "Rp 5.000,\n" +
                    "Parkir mobil Rp 10.000",
            "Rp 10.000",
            "Rp 5.000",
            "Rp 10.000",
            "Rp 10.000 per orang,\n" +
                    "belum termasuk biaya\n" +
                    "masuk wahana lain.",
            "Rp 3.000 per orang.",
            "Rp 5.000 (motor),\n" +
                    "Rp 10.000 (mobil).",
            "Rp 10.000",
            "Gratis",
            "Gratis",
            "Rp 10.000 per orang,\n" +
                    "belum harga tiket parkir."
    };

    private static String[] placeTime = {
            "24 jam",
            "24 jam",
            "08.00-18.00",
            "08.00-18.00",
            "24 jam",
            "24 jam",
            "05.00-15.00",
            "06.00-18.00",
            "08.00-18.00",
            "06.00-18.00",
            "24 jam",
            "08.00-18.00",
            "24 jam",
            "24 jam",
            "07.00-17.00",
            "08.00-18.00",
            "24 jam",
            "06.00-00.00",
            "07.15-18.00",
            "08.00-22.00",
            "24 jam",
            "08.00-18.00",
            "08.00-17.00",
            "24 jam",
            "24 jam",
            "08.00-18.00"
    };

    private static String[] placeLocation = {
            "Rangai Tri Tunggal,\n" +
                    "Katibung, Lampung Selatan,\n" +
                    "Lampung",
            "Sukarame, Punduh Pidada,\n" +
                    "Kabupaten Pesawaran,\n" +
                    "Lampung",
            "Lampung Timur, Lampung",
            "Jalan Teluk Lampung,\n" +
                    "Pidada Panjang, Pesawaran\n" +
                    "Lampung.",
            "Lampung Barat, Lampung",
            "Desa Tanjung Setia,\n" +
                    "Krui, Lampung Barat,\n" +
                    "Lampung",
            "Selat Sunda",
            "Juku Batu, Banjit,\n" +
                    "Kabupaten Way Kanan,\n" +
                    "Lampung",
            "Jalan Raya Danau,\n" +
                    "Fajar Esuk, Pringsewu,\n" +
                    "Kab. Pringsewu, Lampung",
            "Sukajaya Lempasing,\n" +
                    "Padang Cermin, Pesawaran,\n" +
                    "Lampung",
            "Perkebunan Karet PTPN 7\n" +
                    "Afdelin Bergen, Purwodadi,\n" +
                    "Kec. Tanjung Bintang,\n" +
                    "Lampung Selatan",
            "Kelawi, Bakauheni,\n" +
                    "Lampung Selatan.",
            "Desa Pegadungan,\n" +
                    "Kelumbayan, Tanggamus,\n" +
                    "Lampung",
            "Suoh, Lampung Barat,\n" +
                    "Provinsi Lampung",
            "Pugung Raharjo,\n" +
                    "Sekampung Udik,\n" +
                    "Lampung Timur",
            "Dusun Tanjung Raya,\n" +
                    "Kampung Kotaway, Kasui,\n" +
                    "Way Kanan, Lampung",
            "Totoharjo, Bakauheni,\n" +
                    "Lampung Selatan",
            "Jl. Lintas Sumatera,\n" +
                    "Bakauheni, Lampung",
            "JI. Radin Imba Kesuma,\n" +
                    "Tanjung Karang Barat,\n" +
                    "Bandar Lampung",
            "Gebang, Padang Cermin,\n" +
                    "Pesawaran, Lampung.",
            "Campang, Gisting,\n" +
                    "Kab. Tanggamus,\n" +
                    "Lampung.",
            "Desa Muncak, Tel. Pandan,\n" +
                    "Pesawaran, Lampung.",
            "Jalan Griya Persada,\n" +
                    "Blok IIB No.8,\n" +
                    "Bandar Lampung",
            "Desa Rejomulyo, Jatiagung,\n" +
                    "Kab. Lampung Selatan.",
            "Umbul Buah, Kota Agung,\n" +
                    "Kab. Tanggamus,\n" +
                    "Lampung.",
            "Jalan H. Hamim RJP,\n" +
                    "Sukadana Ham, Tj. Karang,\n" +
                    "Bandar Lampung."
    };

    static ArrayList<Place> getListData() {
        ArrayList<Place> list = new ArrayList<>();
        for (int position = 0; position < placeNames.length; position++) {
            Place place = new Place();
            place.setPhoto(placeImages[position]);
            place.setName(placeNames[position]);
            place.setLocation(placeLocation[position]);
            place.setTime(placeTime[position]);
            place.setTicket(placeHTM[position]);
            place.setDetail(placeDetail[position]);
            list.add(place);
        }
        return list;
    }

}
