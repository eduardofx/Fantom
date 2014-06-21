class Calculadora
{
static Void main(){
Env.cur.out.print(“Digite [1] para calcular IMC e [2] para IAC “).flush
op := (Env.cur.in.readLine).toInt
echo(“——————————————————————————”)

if (op == 1){
Env.cur.out.print(“Digite seu Peso “).flush
peso := (Env.cur.in.readLine).toFloat
Env.cur.out.print(“Digite sua Altura “).flush
altura := (Env.cur.in.readLine).toFloat
imc := peso / ((altura)*(altura))
echo (“\n”);
if (imc < 20f)
echo(“Abaixo do Peso\nIMC menor que 20”)
else if ((imc >= 20f) && (imc < 25f))
echo (“Peso Normal\nIMC entre 20 e 24”)
else if((imc >= 25f) && (imc < 30f))
echo (“Acima do Peso\nIMC entre 25 e 29”)
else if ((imc >= 30f) && (imc < 34f))
echo (“Obeso !\nIMC entre 30 e 33”)
else
echo (“Muito Obeso !!\nIMC acima de 34”)
}else if (op == 2){
Env.cur.out.print(“Digite seu Quadril “).flush
quadril := (Env.cur.in.readLine).toFloat
Env.cur.out.print(“Digite sua Altura “).flush
altura := (Env.cur.in.readLine).toFloat
iac := (quadril/(altura*(altura).sqrt))-18
Env.cur.out.print(“Digite [1] para Masculino e [2] para Feminino
“).flush
sexo := (Env.cur.in.readLine).toInt
echo(“——————————————————————————”)
if (sexo == 1){
if (iac <= 8f){
echo (“Abaixo do Peso\nMenor que 8”)
}else if ((iac > 8f) && (iac <= 20f)){
echo (“Peso Normal\nEntre 9 e 20”)
}else if ((iac > 21f)&& (iac <= 25f)){
echo (“Obeso\nEntre 21 e 25”)
}else if (iac > 25f){
echo (“Muito Obeso !\nAcima de 25”)
}
}
else if (sexo == 2){
if (iac <= 21f){
echo (“Abaixo do Peso\nMenor que 21”)
}else if ((iac > 21f) && (iac <= 32f)){
echo (“Peso Normal\nEntre 22 e 32”)
}else if ((iac > 33f)&& (iac <= 38f)){
echo (“Obeso !\nEntre 33 e 38”)
}else if (iac > 38f){
echo (“Muito Obeso !\nAcima de 38”)
}
}
echo (“\nIAC:”)
echo (iac)
}
}
}