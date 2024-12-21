package com.yusfisyawali.mywaifuapps.model;


import com.yusfisyawali.mywaifuapps.R;

import java.util.ArrayList;

public class WaifuData {
    private static final int[] waifuImages = {
            R.drawable.violet,
            R.drawable.shinoa,
            R.drawable.nino,
            R.drawable.ninym,
            R.drawable.milize,
            R.drawable.emilia,
            R.drawable.hinata,
            R.drawable.asuna,
            R.drawable.kaguya,
            R.drawable.kato
    };

    private static final String[] waifuNames = {
            "Violet Evergarden",
            "Shinoa Hiragi",
            "Nino Nakano",
            "Ninym Ralei",
            "Vladilena Milizé",
            "Emilia",
            "Hinata Hyuga",
            "Yuuki Asuna",
            "Kaguya Shinomia",
            "Megumi Kato"
    };

    private static final String[] waifuAnime = {
            "Violet Evergarden",
            "Owari no Seraph",
            "Gotōbun no Hanayome",
            "Tensai Ouji no Akaji Kokka Saisei Jutsu",
            "86 Eighty Six",
            "Re:Zero",
            "Naruto Shippuden",
            "Sword Art Online",
            "Kaguya-Sama wa Kokurasaetai",
            "Saenai Heroine no Sodatekata"
    };

    private static final String[] waifuBirth = {
            "27 Juni",
            "25 Desember",
            "5 Mei",
            "6 April",
            "12 Juli",
            "23 September",
            "27 Desember",
            "30 September",
            "1 Januari",
            "23 September"
    };

    private static final String[] waifuZodiak = {
            "Cancer",
            "Capricorn",
            "Taurus",
            "Aries",
            "Cancer",
            "Libra",
            "Capricorn",
            "Libra",
            "Capricorn",
            "Virgo"
    };

    private static final String[] waifuAges = {
            "14 tahun",
            "15 tahun",
            "17 tahun",
            "16 tahun",
            "16 tahun",
            "15 tahun",
            "19 tahun",
            "16 tahun",
            "18 tahun",
            "16 tahun"
    };

    private static final String[] waifuBloods = {
            "A",
            "AB",
            "A",
            "-",
            "-",
            "-",
            "AB",
            "-",
            "AB",
            "-"
    };

    private static final String[] waifuHeightBody = {
            "161 cm",
            "150 cm",
            "165 cm",
            "159 cm",
            "160 cm",
            "164 cm",
            "163 cm",
            "168 cm",
            "156 cm",
            "160 cm"
    };

    private static final String[]  waifuAbout = {
            "Violet Evergarden (ヴァイオレット・エヴァーガーデン, Vaioretto Evāgāden) adalah protagonis dari seri Violet Evergarden." +
                    "Violet adalah mantan tentara yang terdaftar di tentara Leidenschaftlich dan bertempur dalam perang, di mana dia diperlakukan hanya sebagai senjata." +
                    "Violet menjadi Boneka Kenangan Otomatis di Perusahaan Pos CH setelah perang, berusaha memahami arti kata \"Aku mencintaimu\", yang diucapkan kepadanya oleh mayornya Gilbert Bougainvillea , selama pertempuran terakhir Perang .",
            "Shinoa Hīragi (柊 シノア, Hīragi Shinoa) adalah protagonis wanita utama dari serial manga Seraph of the End: Vampire Reign dan adik dari Mahiru Hīragi. " +
                    "Dia berasal dari Keluarga Hīragi yang bergengsi dan kaya dan ditunjuk sebagai supervisor Yūichirō Hyakuya selama skorsingnya. " +
                    "Dia adalah seorang sersan dari Tentara Iblis Kekaisaran Jepang dan pemimpin Pasukan Shinoa (シ ノ ア 隊, Shinoa-tai) Di Perusahaan Setan Bulan. " +
                    "Dia akhirnya dirasuki oleh Shikama Dōji yang menghancurkan kemanusiaannya.",
            "Nino Nakano (中なか野の 二に乃の, Nakano Nino) adalah salah satu karakter utama dalam serial manga dan anime 5-toubun no Hanayome." +
                    "Dia adalah salah satu dari kembar lima bersaudara, bersama dengan Ichika , Miku , Yotsuba , dan Itsuki Nakano." +
                    "Nino adalah anak tertua kedua dari bersaudara dan berperan sebagai salah satu kekasih utama protagonis, Fuutarou Uesugi.",
            "Ninym Ralei (ニニム・ラーレイNinimu Rārei) adalah salah satu karakter utama dari seri Tensai Ouji no Akaji Kokka Saisei Jutsu ~Sou da, Baikoku Shiyou~ . Dia adalah teman masa kecil dan ajudan Wein." +
                    "Dia adalah satu dari sedikit orang yang mengetahui sifat malas Wein. " +
                    "Ninym adalah seorang gadis cantik dengan rambut putih bersih dan mata merah menyala yang merupakan ciri khas orang Fram.",
            "Vladilena Milizé (ヴラディレーナ・ミリーゼ, Vuradirēna Mirīze), disingkat menjadi Lena , adalah protagonis wanita dari seri 86 -Eighty Six-." +
                    "Dia adalah komandan Shinei Nouzen dan Skuadron Ujung Tombak , yang berkomunikasi dengannya melalui perangkat komunikasi jarak jauh yang dikenal sebagai Para-RAID." +
                    "Setelah kepergian Skuadron Ujung Tombak, dia dikenal karena menuntut perintah dan kepemimpinan yang sangat kompeten, sehingga mendapat julukan Bloody Reina." +
                    "Dia kemudian dikirim sebagai perwakilan Republik San Magnolia untuk Paket Serangan Kedelapan Puluh Enam , di mana dia adalah komandan taktisnya.",
            "Emilia (エ ミ リ ア) adalah tokoh utama dari seri Re: Zero kara Hajimeru Isekai Seikatsu. Dia adalah Half Elf dan kandidat untuk menjadi Raja Lugnica ke-42. " +
                    "Setelah Arc 4, Subaru resmi menjadi knightnya.\n\n" +
                    "Emilia adalah Half-Elf cantik dengan rambut perak panjang dan mata biru keunguan. Dia mengenakan pakaian putih dan ungu bersama dengan bunga putih di rambutnya. " +
                    "Sepanjang seri, dia menata rambutnya dengan berbagai cara.",
            "Hinata Uzumaki (うずまきヒナタ, Uzumaki Hinata; née Hyūga (日向, Hyūga)) adalah anggota klan Hyūga dan Uzumaki dari Konohagakure. Karena cenderung lemah lembut, kurangnya kepercayaan diri Hinata yang tercermin dalam kemampuannya " +
                    "— sifat yang menyebabkan ayahnya menganggap bahwa ia tidak cocok untuk posisinya sebagai pewaris klan. Dia selalu mengamati Naruto Uzumaki, Hinata telah menemukan sebuah contoh untuk diikuti agar menjadi lebih tegas, " +
                    "dan juga seseorang untuk dicintai. Dalam keanggotaannya dengan Tim Kurenai, dia berusaha untuk menjadi cukup kuat agar mengubah dirinya sendiri, jika bahkan sedikit demi sedikit. Dengan selalu latihan bersama Neji Hyuga ia menjadi lebih kuat dengan semangat Naruto.",
            "Yuuki Asuna (結 城 明日 奈, Yūki Asuna) adalah putri dari mantan CEO RECT Inc. Asuna adalah salah satu dari 10.000 pemain yang terperangkap di Sword Art Online, di mana dia adalah sub-pemimpin dari guild Knights of the Blood (KoB). Keterampilannya dengan rapier membuatnya mendapatkan julukan The Flash (閃光, Senkō).\n\n" +
                    "Asuna memiliki rambut kastanye panjang berwarna oranye kecoklatan dan mata cokelat. Pada tingkat awal SAO, dia mengenakan tunik kulit merah tua dengan pelindung dada tembaga ringan dan celana kulit dengan sepatu bot sampai ke lutut bersama dengan jubah berkerudung. Setelah bergabung dengan Knights of the Blood, " +
                    "dia mengenakan seragam merah dan putih yang dipakai semua anggota KoB dan menggunakan rapier yang dibuat oleh Lisbeth, yang disebut Lambent Light. Setelah Insiden Ordinal Scale, Asuna mulai memakai cincin janji yang diberikan oleh Kazuto di jari manis kirinya.",
            "Kaguya Shinomiya (四 宮  か ぐ や, Shinomiya Kaguya) adalah salah satu protagonis dan karakter tituler dari seri Kaguya-sama wa Kokurasetai. Dia adalah siswi sekolah menengah tahun kedua di Akademi Shuchi'in, anggota Klub Panahan, " +
                    "dan Wakil ketua OSIS ke-67 dan ke-68.\n\n" +
                    "Kaguya adalah seorang gadis muda dengan rambut hitam panjang, kulit putih, tubuh langsing, mata merah, dan rambutnya selalu diikat dengan pita. Dulu sebelumnya, dia masuk OSIS dan selalu menggerai rambutnya tanpa pita merah ikonik. Kemudian, ketika menjadi lebih dekat dengan OSIS dan murid lain di sekolahnya, " +
                    "dia meminta pembantunya Hayasaka untuk membuatnya \"manis\". Pita adalah upayanya untuk membuat rambutnya tidak terlalu mencolok. Dia biasanya mengenakan seragam sekolah Shuchi'in.",
            "Megumi Kato (加藤 恵Katō Megumi) adalah teman sekelas Tomoya Aki , yang hampir tidak diperhatikan oleh orang lain." +
                    "Di anime, dia satu kelas dengan Tomoya sejak tahun pertama mereka, tapi dia tidak pernah memperhatikannya." +
                    "Saat di light novel, pada tahun pertama, Megumi bersekolah di kelas E sementara Tomoya bersekolah di kelas A." +
                    "Setelah Tomoya bertemu dengannya saat pemanggilan takdir, dia menginspirasinya untuk membuat game sim kencan, menampilkan dia sebagai Pahlawan Utama. Namun, dia kecewa dengan kepribadian aslinya."

    };

    private static final String[] animeDetail = {
            "Perang Besar akhirnya berakhir setelah konflik selama empat tahun yang panjang; terbelah menjadi dua, benua Telesis perlahan mulai berkembang kembali." +
                    "Yang terjebak dalam pertumpahan darah adalah Violet Evergarden, seorang gadis muda yang dibesarkan dengan tujuan menghancurkan garis musuh." +
                    "Dirawat di rumah sakit dan menjadi cacat dalam pertempuran berdarah di bagian terakhir Perang, dia hanya tinggal mendengar kata-kata dari orang yang paling dia sayangi, namun tidak mengerti maksudnya.\r\n" +
                    "\r\n" +
                    "Sembuh dari luka-lukanya, Violet memulai hidup baru dengan bekerja di CH Postal Services setelah berselisih dengan keluarga wali barunya. Di sana, dia secara kebetulan menyaksikan karya \"Boneka Memori Otomatis\", amanuense yang menuliskan pikiran dan perasaan orang ke dalam kata-kata di atas kertas. Tergerak oleh gagasan tersebut, Violet mulai bekerja sebagai Auto Memory Doll, sebuah perdagangan yang akan membawanya pada sebuah petualangan, yang akan mengubah kehidupan kliennya dan mudah-mudahan mengarah pada penemuan jati diri.",
            "Pada tahun 2012, dunia diduga telah berakhir karena virus buatan manusia yang melanda penduduk dunia dan hanya menyisakan anak-anak berusia di bawah tiga belas tahun. " +
                    "Di saat yang sama vampir muncul. Mereka mengklaim telah menaklukkan dunia dan akan menjadi pelindung baru bagi manusia. " +
                    "\"Perlindungan\" ini harus dibayar dengan menyumbangkan darah kepada para vampir. " +
                    "Pada usia dua belas, Yuichiro, Mikaela dan teman-temannya dari Panti Asuhan Hyakuya berencana untuk melarikan diri dari para vampir. " +
                    "Namun, rencana ini gagal dan mengakibatkan kematian Mikaela dan lainnya yang mengorbankan diri agar Yuichiro dapat pergi. " +
                    "Kemudian Yuichiro diselamatkan oleh anggota Moon Demon Company, sebuah unit pemusnahan vampir milik Kekaisaran Iblis Tentara Jepang. " +
                    "Empat tahun kemudian, Yuichiro mendedikasikan hidupnya untuk menghancurkan vampir dan membalas dendam terhadap mereka untuk membunuh \"keluarga\" nya.",
            "Fuutarou Uesugi adalah siswa sekolah menengah yang berprestasi, tetapi menjalani kehidupan yang sulit." +
                    "Kepribadiannya yang angkuh dan sifat penyendiri membuatnya tidak punya teman, dan ayahnya terlilit hutang, sehingga memaksa keluarganya untuk bertahan hidup.\r\n" +
                    "\r\n" +
                    "Suatu hari saat istirahat makan siang, Uesugi berdebat dengan seorang siswi pindahan yang telah mengklaim \"tempat duduknya\", yang menyebabkan keduanya tidak menyukai satu sama lain. Pada hari yang sama, ia diberikan kesempatan emas untuk melunasi hutang keluarganya: sebuah pekerjaan les privat untuk putri keluarga kaya, dengan upah lima kali lipat dari harga pasar. Dia menerima lamaran tersebut, namun merasa ngeri saat mengetahui bahwa kliennya, Itsuki Nakano, adalah gadis yang dia temui sebelumnya!\r\n" + //
                    "\r\n" + //
                    "Setelah gagal mencoba untuk kembali ke sisi baik Itsuki, Uesugi mengetahui bahwa masalahnya tidak berakhir di situ: Itsuki sebenarnya adalah kembar lima, jadi selain dia, dia juga harus mengajari saudara perempuannya Miku, Yotsuba, Nino, dan Ichika. yang, meskipun ada ancaman gagal, tidak ingin berurusan dengan seorang tutor. Namun, penghidupan keluarganya berada dalam bahaya sehingga Uesugi terus maju, bersikeras dalam tekadnya untuk menghilangkan kebencian saudara perempuan mereka terhadap belajar dan berhasil mengantarkan mereka ke kelulusan.",
            "Raja Natra jatuh sakit, meninggalkan satu-satunya harapan kerajaannya kepada putranya, Pangeran Wein Salema Arbalest. Dikenal cakap dan bijaksana, dia adalah kandidat yang tepat untuk menjadi pangeran bupati." +
                    "Namun, jika sang pangeran ingin mengatakan sesuatu tentang masalah ini, dia lebih suka menjual Kerajaan Natra kepada penawar tertinggi!\r\n" +
                    "\r\n" +
                    "Karena dia memegang kekuasaan takhta, tidak ada yang bisa menghentikan Wein melelang negara dan menggunakan keuntungannya untuk pensiun dengan nyaman. Yang perlu dia lakukan hanyalah meningkatkan nilai kerajaan kecil untuk memaksimalkan keuntungannya. Namun apakah rencana besar Wein akan berhasil masih harus dilihat, karena kecerdasannya sering kali melebihi ekspektasinya sendiri sangat bermanfaat bagi warga Natra yang tidak menyadarinya.",
            "Menurut Republik San Magnolia, perang mereka yang sedang berlangsung melawan Kekaisaran Giadian tidak memakan korban jiwa namun, itu hanyalah propaganda belaka." +
                    "Sementara delapan puluh lima sektor Republik Alba yang berambut perak hidup dengan aman di balik tembok pelindung, mereka yang berpenampilan berbeda ditahan di faksi rahasia delapan puluh enam." +
                    "Dikenal di kalangan militer sebagai Delapan Puluh Enam, mereka dipaksa berperang melawan Legiun otonom Kekaisaran di bawah komando \"Penangan\" Partai Republik.\r\n" +
                    "\r\n" +
                    "Vladilena Miliz ditugaskan ke skuadron Ujung Tombak untuk menggantikan Handler mereka sebelumnya." +
                    "Dijauhi oleh teman-temannya karena menjadi sesama pendukung Eighty-Six, dia terus berjuang melawan diskriminasi tidak manusiawi dari mereka. Shinei Nouzen adalah kapten skuadron Ujung Tombak. Terkenal karena menjadi satu-satunya yang selamat dari setiap skuadron yang dia ikuti, dia bersikeras untuk memikul nama dan keinginan rekan-rekannya yang gugur." +
                    "Ketika nasib jiwa-jiwa muda dari dua dunia berbeda ini bertabrakan, akankah hal itu memicu percikan yang menerangi jalan mereka menuju keselamatan, atau akankah mereka membakar diri mereka sendiri dalam api keputusasaan?",
            "Bercerita tentang Natsuki Subaru seorang NEET yang secara misterius terlempar ke dunia lain setelah keluar dari minimarket dekat rumahnya. " +
                    "Karena kepayahan dan kebodohan Subaru serta dirinya yang memang tak mempunyai kekuatan lain yang bisa digunakan untuk melindungi diri membuatnya beberapa kali merasakan kematian. " +
                    "Dan disinilah perjuangan Subaru, manusia tanpa kekuatan super yang hanya bisa bergantung dengan sikap pantang menyerah dan kemampuan mengulang kembali kematiannya ke suatu checkpoint dimulai!",
            "Lanjutan dari anime Naruto. Berkisah tentang Uzumaki Naruto yang sedang berusaha menyelamatkan Uchiha Sasuke dari Orochimaru. Setelah dua setengah tahun berlatih dengan Jiraiya-sensei, akhirnya Naruto kembali ke desa Konoha. " +
                    "Dengan ditemani oleh ninja Konoha lainnya, dia berjanji akan membawa pulang Sasuke. Akan tetapi dalam perjalanannya mereka harus menghadapi berbagai musuh yang lebih berbahaya, yaitu anggota organisasi Akatsuki.",
            "Sword Art Online (Sōdo Āto Onrain) adalah permainan VRMMORPG Online pertama yang di produksi lewat NerveGear dengan bantuan Kayaba Akihiko sebagai Ketua Developernya.\n" +
                    "\n" +
                    "Bersetting di dunia fantasi yang mempunyai sebuah kastil besar dengan ratusan anak tangga bernama Aincrad, semulanya nampak indah dan terlihat menakjubkan. Namun setelah tahap peluncuran pertama gamenya, sebanyak 10.000 pemain yang sudah login tak dapat kembali kedunia nyata lantaran tak tersedia tombol logout dan tak dapat keluar dari permainan.\n" +
                    "\n" +
                    "Masalah bukan hanya itu saja, jika pemain mati di game ini mereka juga akan mati didunia nyata, begitu juga jika NerveGear yang ada di dunia nyata dilepas.",
            "Kaguya Shinomiya dan Miyuki Shirogane, dua orang jenius anggota OSIS Akademi bergengsi, yang menjadikan mereka terelit di kalangan elit. Keduanya memiliki perasaan tertarik satu sama lain, " +
                    "Hanya saja ada satu masalah besar yang menghalangi jalan cinta kasih sayang mereka. Mereka berdua gengsi untuk menjadi orang pertama yang mengakui perasaan romantis mereka. Sehingga perang cinta antara mereka berdua pun dimulai.",
            "Otaku laki-laki Tomoya Aki, yang bekerja paruh waktu untuk mendapatkan uang guna membeli anime, suatu hari bertemu dengan seorang gadis cantik selama liburan musim semi." +
                    "Sebulan kemudian, dia mengetahui bahwa gadis itu adalah teman sekelasnya, Megumi, yang hampir tidak diperhatikan oleh teman sekelas lainnya." +
                    "Tomoya, yang juga tidak memiliki keahlian atau kemampuan khusus, pergi ke Eriri Spencer Sawamura, anggota Klub Seni yang terkenal, untuk memberikan seni untuk permainan yang sedang dikembangkan klub, dan ke Utaha Kasumigoaka untuk menulis skenario permainan." +
                    "Ketiganya kemudian membentuk Blessing Software, yang rencananya akan mereka jual di Comiket berikutnya "
    };


    public static ArrayList<Waifu> getListData() {
        ArrayList<Waifu> list = new ArrayList<>();
        for (int position = 0; position < waifuNames.length; position++) {
            Waifu waifu = new Waifu();
            waifu.setPhoto(waifuImages[position]);
            waifu.setName(waifuNames[position]);
            waifu.setAnime(waifuAnime[position]);
            waifu.setBirth(waifuBirth[position]);
            waifu.setZodiak(waifuZodiak[position]);
            waifu.setAge(waifuAges[position]);
            waifu.setBlood(waifuBloods[position]);
            waifu.setHeightBody(waifuHeightBody[position]);
            waifu.setAboutWaifu(waifuAbout[position]);
            waifu.setAnimeDetail(animeDetail[position]);
            list.add(waifu);
        }
        return list;
    }
}
