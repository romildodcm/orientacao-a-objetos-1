import java.io.*;

public class ExEscritaHTMLCores {
    public static void main(String[] args) throws Exception{
		String arqSaida = "cores.html";
		BufferedWriter arqGravacao = new BufferedWriter(new FileWriter(arqSaida));
		
		arqGravacao.write("<html><head><title>Tabela de Cores HTML</title>");
		arqGravacao.newLine();
		arqGravacao.write("<meta http-equiv='Content-Type'content='text/html; charset=UTF-8'></head>");
		arqGravacao.newLine();
		arqGravacao.write("<body><p>&nbsp;</p><h2 align='center'>Tabela de Cores HTML</h2>");
		arqGravacao.newLine();
		arqGravacao.write("<table width='400' align='center' border='1'>");
		arqGravacao.newLine();
		arqGravacao.write("<tr><th width='200' align='center'>Cor</th>");
		arqGravacao.newLine();
		arqGravacao.write("<th width='200' align='center'>Código Hexadecimal</th></tr>");
		arqGravacao.newLine();
        
        String[] corHexa = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};
        String cor;
		for(int r = 0; r <= 15; r++){
            for(int g = 0; g <= 15; g++){
                for(int b = 0; b <= 15; b++){
                    cor = "#" + corHexa[r] + "0" + corHexa[g] + "0" + corHexa[b] + "0";
                    arqGravacao.write("<td bgcolor='"+cor+"'></td><td align='center'>"+cor+"</td></tr>");
                    arqGravacao.newLine();
                }
            }
        }
		arqGravacao.write("</table></body></html>");
		arqGravacao.close();
	}
}
