<div align=center><img  src="https://gitee.com/LeonShih/Image/raw/master/tb.png"/></div>

<h1 align="center">ToolsFx</h1>
<p align="center">
<a href="https://github.com/Leon406/ToolsFx/releases/latest"><img src="https://img.shields.io/github/release/Leon406/ToolsFx.svg"/></a>
<a href="https://github.com/Leon406/ToolsFx/actions/workflows/detekt-analysis.yml/badge.svg"><img src="https://github.com/Leon406/ToolsFx/actions/workflows/detekt-analysis.yml/badge.svg"/></a><img src="https://img.shields.io/badge/language-kotlin-orange.svg"/>
<a href="changelog.md"><img src="https://img.shields.io/badge/updates-%E6%9B%B4%E6%96%B0%E6%97%A5%E5%BF%97-brightgreen"/></a>
<img src="https://img.shields.io/badge/license-ISC-green"/>
<img src="https://img.shields.io/github/downloads/Leon406/Toolsfx/total"/>
</p>
<p align="center">
<a href="README.md">English</a>|<a href="README-zh.md">中文</a>
</p>

<h4 align="center">Visitors :eyes:</h4>

<p align="center"><img src="https://profile-counter.glitch.me/Leon406_ToolsFx/count.svg" alt="ToolsFx :: Visitor's Count" />
 <img width=0 height=0 src="https://profile-counter.glitch.me/Leon406/count.svg" alt="Leon406:: Visitor's Count" />
</p>

------


## Function

### Encoding

- [x] base64
- [x] urlBase64
- [x] base16/32/36/58/62/85/91/92/100
- [x] base58check
- [x] UrlEncode
- [x] Unicode
- [x] js hex(\x61)/js octal(\140)
- [x] binary/octal/decimal/hex
- [x] custom base serial dict

![encode](./art/encode.gif)



**String Process(eg. Split)**

![encode_split](./art/encode_split.gif)



### Encoding Transfer (not raw data)

- [x] Transfer

![encode](./art/encode_transfer.gif)
### Digest(Hash)

 support file, big file which is larger than 8Gi

- [x] md serial
- [x] sha1
- [x] sha2serial
- [x] sha3
- [x] SM3
- [x] RIPEMD
- [x] whirpool
- [x] Tiger
- [x] etc.

![hash](./art/hash.gif)

### MAC

#### HMAC

- [x] md serial
- [x] sha1
- [x] sha2serial
- [x] sha3
- [x] SM3
- [x] RIPEMD
- [x] whirpool
- [x] Tiger
- [x] etc.

#### CMAC

- [x] AESCMAC
- [x] BLOWFISHCMAC
- [x] DESCMAC
- [x] DESEDECMAC
- [x] SEED-CMAC
- [x] Shacal-2CMAC
- [x] SM4-CMAC
- [x] Threefish-256CMAC  / Threefish-512CMAC / Threefish-1024CMAC  

#### GMAC

#### POLY1305 

- [x] POLY1305
- [x] POLY1305-AES
- [x] POLY1305-ARIA
- [x] POLY1305-CAMELLIA
- [x] POLY1305-CAST6
- [x] POLY1305-NOEKEON
- [x] POLY1305-RC6
- [x] POLY1305-SEED
- [x] POLY1305-SERPENT
- [x] POLY1305-SM4
- [x] POLY1305-Twofish

### Symmetric Crypto(block cipher)

#### Encrypt Algorithm

- [x] DES/3DES
- [x] AES
- [x] SM4
- [x] Blowfish
- [x] Twofish
- [x] RC2
- [x] etc.

#### support mode

- ECB
- CBC
- OFB(n)
- CFB(n)
- SIC (also known as CTR)
- CTS (equivalent to CBC/WithCTS)
- CCM (AEAD)
- EAX (AEAD)
- GCM (AEAD)
- OCB (AEAD)

#### support padding scheme

- No padding
- PKCS5/7
- ISO10126/ISO10126-2
- ISO7816-4/ISO9797-1
- X9.23/X923
- TBC
- ZeroByte
- withCTS (if used with ECB mode)

![sym](./art/sym.gif)

### Symmetric Crypto (stream cipher)
- [x] RC4
- [x] HC128/HC256
- [x] ChaCha
- [x] Salsa20
- [x] XSalsa20
- [x] VMPC
- [x] Grainv1
- [x] Grain128
- [x] Zuc128
- [x] Zuc128

### Asymmetric Crypto RSA

- [x]  support pkcs1 /pkcs8 key
- [x]  supprot 512/1024/2048/3072/4096 bit
- [x]  support plain text length longer than key size
- [x]  support public key encryt and private key encrypt
- [x]  support openssl pkcs1/pkcs8  privte key format
- [x]  support certification cer file
- [x]  support pem and pk8 format :new:

![sym](./art/asy.gif)

 **public key decrypt hex encoded data**

![sym](./art/rsa_pub_decrypt_hexdata.gif)

### Digital Signature 

- [x] RSA serial
- [x] DSA
- [x] ECDSA
- [x] EC
- [x] EdDSA(ED448/ED25192)
- [x] SM2
- [ ] other

### Classical Crypto (for CTF)

- [x] caesar
- [x] rot5/rot13/rot18/rot47
- [x] affine
- [x] virgenene
- [x] atbash
- [x] morse
- [x] qwe keyborad
- [x] polybius
- [x] bacon 24/bacon26
- [x] one time pad
- [x] socialist core value
- [x] ADFGX/ADFGVX
- [x] Auto Key
- [x] railfence normal /railfence w-type
- [x] playfair
- [x] brainfuck/troll/ook
- [x] Braille
- [x] alphabet index
- [x] 01248


### Others

- [x] Qrcode
- [x] String Process
- [ ] TBD

### Features

- [x] support drag file
- [x] Symmetirc Crypto support base64/hex encoded key, iv
- [x] Digest and Symmetirc  Crypto support multi files
- [x] i18n
- [x] CTF releated
- [x] PBE
- [x] module configable,support online url

[bouncycastle document](https://www.bouncycastle.org/specifications.html) 

## Downloads

 [github release](https://github.com/Leon406/ToolsFx/releases) 

 [gitte mirror(for Chinese user)](https://gitee.com/LeonShih/ToolsFx) 

download boost https://leon.lanzoui.com/b0d9av2kb code：52pj



### Issues, PRs are welcome!!!



## Version Choose

- with jre environment
  - jdk8      choose suffix with jdk8
  - jdk11+   choose suffix with jdk11 & also need to config javafx environment
- w/o jre environment(Windows user only)
  - 64bit Windows      x64 (jre11)
  - 32/64bit Windows x86 (jre8,have no idea, choose this)  
- beta (jar file)
  copy jar file to lib directory and delete ToolsFx-xxx.jar
  

## How to Run

- Linux/Mac OS double click ToolsFx  in  root directory 
- Windows double click ToolsFx.bat or vbs file(remove black command window)

## How to Config
When Application is running ,it will generate ToolsFx.properties automatically , just modify the value. Below are the details.

| key                     | value                                             |
| ----------------------- | ------------------------------------------------- |
| isEnableClassical       | Classical module switch,default is false          |
| isEnablePBE             | PBE module switch,default is false                |
| isEnableSignature       | Signature module switch,default is  true          |
| isEnableMac             | MAC module switch,default is  true                |
| isEnableSymmetricStream | Symmetric( Stream) module switch,default is  true |
| isEnableQrcode          | Qrcode module switch,default is  true             |
| isEnableInternalWebview | Internal Browser switch,default is false          |
| extUrls                 | Internal Browser favourite urls, spit with comma  |



## [PLUGIN](README-plugin.md)

- ApiPost   Network Debug Tools

## CHANGE LOG

see [changelog.md](changelog.md)

## CREDIT

[bouncy castle](https://github.com/bcgit/bc-java) 

[tornadofx](https://github.com/edvin/tornadofx)

[badge maker](https://shields.io/)

## Stargazers over time

[![Stargazers over time](https://starchart.cc/Leon406/ToolsFx.svg)](https://starchart.cc/Leon406/ToolsFx)

## LICENSE

```
ISC License

Copyright (c) 2021, Leon406

Permission to use, copy, modify, and/or distribute this software for any
purpose with or without fee is hereby granted, provided that the above
copyright notice and this permission notice appear in all copies.

THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES
WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF
MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR
ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES
WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN
ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF
OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
```

[Go Top](#top)

