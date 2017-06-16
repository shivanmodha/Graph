package studios.vanish.graph;

public class GraphVertex
{
	public double X;
	public double Y;
	public double Z;
	public GraphVertex()
	{
		this(0, 0, 0);
	}
	public GraphVertex(double _in)
	{
		this(_in, _in, _in);
	}
	public GraphVertex(double _x, double _y, double _z)
	{
		X = _x;
		Y = _y;
		Z = _z;
	}
	public GraphVertex(GraphVertex base)
	{
		this(base.X, base.Y, base.Z);
	}
	public GraphVertex add(GraphVertex _point)
	{
		return new GraphVertex(X + _point.X, Y + _point.Y, Z + _point.Z);
	}
	public GraphVertex subtract(GraphVertex _point)
	{
		return new GraphVertex(X - _point.X, Y - _point.Y, Z - _point.Z);
	}
	public GraphVertex multiply(GraphVertex _point)
	{
		return new GraphVertex(X * _point.X, Y * _point.Y, Z * _point.Z);
	}
	public GraphVertex divide(GraphVertex _point)
	{
		return new GraphVertex(X / _point.X, Y / _point.Y, Z / _point.Z);
	}
	public boolean equals(GraphVertex _point)
	{
		if ((X == _point.X) && (Y == _point.Y) && (Z == _point.Z))
		{
			return true;
		}
		return false;
	}
	public double dot(GraphVertex vert)
	{
		return (X * vert.X) + (Y * vert.Y) + (Z * vert.Z);
	}
	public GraphVertex cross(GraphVertex vert)
	{
		return new GraphVertex((Y * vert.Z) - (Z * vert.Y), (X * vert.Z) - (Z * vert.X), (X * vert.Y) - (Y * vert.X));
	}
	public double magnitude()
	{
		return Math.sqrt(Math.pow(X, 2) + Math.pow(Y, 2) + Math.pow(Z, 2));
	}
	public String toString()
	{
		return "(" + X + ", " + Y + ", " + Z + ")";
	}
}
