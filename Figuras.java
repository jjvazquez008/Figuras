
public class Figuras {

	public static void main(String[] args) {
		int lineas = 5;
		System.out.println("Cuadrado");
		System.out.println("--------\n");

		for(int i=0;i<lineas;i++)
		{
			for(int j=0;j<lineas;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}

		System.out.println("\n\nRombo");
		System.out.println("------\n");

		for(int i=1;i<=(lineas/2)+1;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		for(int i=(lineas/2);i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}

		System.out.println("\n\nAbeto");
		System.out.println("------\n");

		int contador = 1;
		for(int i=1;i<=lineas;i++)
		{
			contador++;
			for(int j=1;j<=contador;j++)
			{
				for(int k=0;k<j;k++)
				{
					System.out.print("*");
				}
				System.out.print("\n");
			}
		}

		System.out.println("**");
		System.out.println("**");
	}

}
