package classification.datamining_ID3;


import lombok.Data;

import java.util.ArrayList;

/**
 * 属性节点，不是叶子节点
 *
 * @author lyq
 */
@Data
public class AttrNode {
    //当前属性的名字
    private String attrName;
    //父节点的分类属性值
    private String parentAttrValue;
    //属性子节点
    private AttrNode[] childAttrNode;
    //孩子叶子节点
    private ArrayList<String> childDataIndex;

}
