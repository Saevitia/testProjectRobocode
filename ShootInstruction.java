package CERI;

public class ShootInstruction 
{
	private double gunDirection;
	private double puissance;
	
	public ShootInstruction()
	{
		System.out.println("NOTICE : Le constructeur par d�faut de ShootInstruction est appell�");
	}
	
	public ShootInstruction(double angle, double power)
	{
		setGunDirection(angle);
		setPuissance(power);
	}

	public double getPuissance() 
	{
		return puissance;
	}

	public void setPuissance(double puissance) 
	{
		this.puissance = puissance;
	}

	public double getGunDirection() 
	{
		return gunDirection;
	}

	public void setGunDirection(double gunDirection) 
	{
		this.gunDirection = gunDirection;
	}
}
