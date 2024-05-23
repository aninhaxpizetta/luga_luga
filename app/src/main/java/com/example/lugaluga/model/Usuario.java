package com.example.lugaluga.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Usuario implements Parcelable {
    private String nome;

    private String cpf;

    private String dataNasc;

    private String cep;

    private String municipio;

    private String uf;

    private  String logradouro;

    private int numero;

    private String complemento;

    private String bairro;

    private int telefone;

    private String email;

    private  String senha;

    public Usuario() {


    }

    protected Usuario(Parcel in) {
        nome = in.readString();
        cpf = in.readString();
        dataNasc = in.readString();
        cep = in.readString();
        municipio = in.readString();
        uf = in.readString();
        logradouro = in.readString();
        numero = in.readInt();
        complemento = in.readString();
        bairro = in.readString();
        telefone = in.readInt();
        email = in.readString();
        senha = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nome);
        dest.writeString(cpf);
        dest.writeString(dataNasc);
        dest.writeString(cep);
        dest.writeString(municipio);
        dest.writeString(uf);
        dest.writeString(logradouro);
        dest.writeInt(numero);
        dest.writeString(complemento);
        dest.writeString(bairro);
        dest.writeInt(telefone);
        dest.writeString(email);
        dest.writeString(senha);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Usuario> CREATOR = new Creator<Usuario>() {
        @Override
        public Usuario createFromParcel(Parcel in) {
            return new Usuario(in);
        }

        @Override
        public Usuario[] newArray(int size) {
            return new Usuario[size];
        }
    };
    
}
