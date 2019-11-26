package classification.decision_tree.datamining_CART;

import lombok.Data;

import java.util.ArrayList;

/**
 * 回归分类树节点
 *
 * @author lyq
 */
@Data
public class AttrNode {
    // 节点属性名字
    private String attrName;
    // 节点索引标号
    private int nodeIndex;
    //包含的叶子节点数
    private int leafNum;
    // 节点误差率
    private double alpha;
    // 父亲分类属性值
    private String parentAttrValue;
    // 孩子节点
    private AttrNode[] childAttrNode;
    // 数据记录索引
    private ArrayList<String> dataIndex;

}
