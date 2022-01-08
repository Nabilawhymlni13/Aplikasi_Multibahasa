package com.example.flower;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import com.example.flower.Model.Bunga;
import com.example.flower.Model.Mawar;
import com.example.flower.Model.Melati;
import com.example.flower.Model.Matahari;


public class DataProvider {
    private static List<Bunga> bungas = new ArrayList<>();

    private static List<Mawar> initDataMawar(Context ctx) {
        List<Mawar> mawars = new ArrayList<>();
        mawars.add(new Mawar(ctx.getString(R.string.alba_nama), ctx.getString(R.string.alba_asal),
                ctx.getString(R.string.alba_deskripsi), R.drawable.ralba));
        mawars.add(new Mawar(ctx.getString(R.string.canina_nama), ctx.getString(R.string.canina_asal),
                ctx.getString(R.string.canina_deskripsi), R.drawable.rcanina));
        mawars.add(new Mawar(ctx.getString(R.string.cinensis_nama), ctx.getString(R.string.cinensis_asal),
                ctx.getString(R.string.cinensis_deskripsi), R.drawable.rchinensis));
        mawars.add(new Mawar(ctx.getString(R.string.foetida_nama), ctx.getString(R.string.foetida_asal),
                ctx.getString(R.string.foetida_deskripsi), R.drawable.rfoetida));
        mawars.add(new Mawar(ctx.getString(R.string.lincoln_nama), ctx.getString(R.string.lincoln_asal),
                ctx.getString(R.string.lincoln_deskripsi), R.drawable.rlincolnn));
        mawars.add(new Mawar(ctx.getString(R.string.buff_nama), ctx.getString(R.string.buff_asal),
                ctx.getString(R.string.buff_deskripsi), R.drawable.rbeautyy));
        return mawars;
    }

    private static List<Melati> initDataMelati(Context ctx) {
        List<Melati> melatis = new ArrayList<>();
        melatis.add(new Melati(ctx.getString(R.string.auri_nama), ctx.getString(R.string.auri_asal),
                ctx.getString(R.string.auri_deskripsi), R.drawable.jauriculatum));
        melatis.add(new Melati(ctx.getString(R.string.azo_nama), ctx.getString(R.string.azo_asal),
                ctx.getString(R.string.azo_deskripsi), R.drawable.jazoricum));
        melatis.add(new Melati(ctx.getString(R.string.dico_nama), ctx.getString(R.string.dico_asal),
                ctx.getString(R.string.dico_deskripsi), R.drawable.jdichotomum));
        melatis.add(new Melati(ctx.getString(R.string.gran_nama), ctx.getString(R.string.gran_asal),
                ctx.getString(R.string.gran_deskripsi), R.drawable.jgrandiflorum));
        melatis.add(new Melati(ctx.getString(R.string.poli_nama), ctx.getString(R.string.poli_asal),
                ctx.getString(R.string.poli_deskripsi), R.drawable.jpolyanthum));
        melatis.add(new Melati(ctx.getString(R.string.winter_nama), ctx.getString(R.string.winter_asal),
                ctx.getString(R.string.winter_deskripsi), R.drawable.jwinter));
        return melatis;
    }

    private static List<Matahari> initDataMatahari(Context ctx) {
        List<Matahari> mataharis = new ArrayList<>();

        mataharis.add(new Matahari(ctx.getString(R.string.para_nama), ctx.getString(R.string.para_asal),
                ctx.getString(R.string.para_deskripsi), R.drawable.sparadoxuss));
        mataharis.add(new Matahari(ctx.getString(R.string.bola_nama), ctx.getString(R.string.bola_asal),
                ctx.getString(R.string.bola_deskripsi), R.drawable.sbolanderi));
        mataharis.add(new Matahari(ctx.getString(R.string.debi_nama), ctx.getString(R.string.debi_asal),
                ctx.getString(R.string.debi_deskripsi), R.drawable.sdebilis));
        mataharis.add(new Matahari(ctx.getString(R.string.giga_nama), ctx.getString(R.string.giga_asal),
                ctx.getString(R.string.giga_deskripsi), R.drawable.sgiganteus));
        mataharis.add(new Matahari(ctx.getString(R.string.nutali_nama), ctx.getString(R.string.nutali_asal),
                ctx.getString(R.string.nutali_deskripsi), R.drawable.snuttallii));
        mataharis.add(new Matahari(ctx.getString(R.string.oci_nama), ctx.getString(R.string.oci_asal),
                ctx.getString(R.string.oci_deskripsi), R.drawable.soccidentalis));
        return mataharis;
    }

    private static void initAllBungas(Context ctx) {
        bungas.addAll(initDataMawar(ctx));
        bungas.addAll(initDataMelati(ctx));
        bungas.addAll(initDataMatahari(ctx));
    }

    public static List<Bunga> getAllBunga(Context ctx) {
        if (bungas.size() == 0) {
            initAllBungas(ctx);
        }
        return  bungas;
    }

    public static List<Bunga> getBungasByTipe(Context ctx, String jenis) {
        List<Bunga> bungasByType = new ArrayList<>();
        if (bungas.size() == 0) {
            initAllBungas(ctx);
        }
        for (Bunga h : bungas) {
            if (h.getJenis().equals(jenis)) {
                bungasByType.add(h);
            }
        }
        return bungasByType;
    }

}
