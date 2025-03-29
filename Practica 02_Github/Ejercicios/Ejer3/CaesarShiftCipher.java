public class CaesarShiftCipher {
    public String caesarShiftCipher(String message, int shift) {
        if (message == null || message.isEmpty()) return message;
        
        StringBuilder sb = new StringBuilder();
        shift = shift % 26; // Ajustar el rango del desplazamiento

        for (char c : message.toCharArray()) {
            if (c == ' ') {
                sb.append(c);
            } else if (c >= 'a' && c <= 'z') {
                char shifted = (char) (c + shift);
                if (shifted > 'z') {
                    shifted -= 26;
                } else if (shifted < 'a') {
                    shifted += 26;
                }
                sb.append(shifted);
            } else {
                return "invalid"; // Si hay caracteres inválidos
            }
        }
        return sb.toString();
    }
}
