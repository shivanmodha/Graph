package Graph;
public class Direction
{
	public String Instruction;
	public double Angle;
	public Direction(String _in)
	{
		Instruction = _in;
		Angle = 0;
	}
	public Direction(String _in, double _ang)
	{
		Instruction = _in;
		Angle = _ang;
	}
	public String toString()
	{
		return Instruction + " (" + Angle + ")";
	}
}
