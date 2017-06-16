package studios.vanish.graph;
public class Structure
{
	public StructureType Type = StructureType.Building;
	public Node Center;
	public GraphVertex Bound_Bottom_Left = null;
	public GraphVertex Bound_Bottom_Right = null;
	public GraphVertex Bound_Top_Left = null;
	public GraphVertex Bound_Top_Right = null;
	public Structure(Node _center)
	{
		Center = _center;
	}
}