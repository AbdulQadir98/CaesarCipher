object CaesarCipher extends App{
  val alphabet ="ABCDEFGHIJKLMNOPQRSTUVWXYZ"

  val encrypt = (character:Char, key:Int, alph:String) =>
  alph((alph.indexOf(character.toUpper)+key) % alph.size)

  val decrypt = (character:Char, key:Int, alph:String) =>
    alph((alph.indexOf(character.toUpper)-key) % alph.size)

  val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,alph:String)=>
    s.map(algo(_,key,alph))

  val x = "CIPHER"
  val ciphertext = cipher(encrypt,x,5,alphabet)
  val ciperpattern =cipher(decrypt,ciphertext,5,alphabet)

  println("Encode   : "+ciphertext)
  println("Decode   : "+ciperpattern)
}
