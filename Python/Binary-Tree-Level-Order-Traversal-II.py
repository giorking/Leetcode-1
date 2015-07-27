#!/usr/bin/env python


# @param root, a tree node
# @return a list of lists of integers
def levelOrderBottom(self, root):
    q = []
    p = []
    seq = []
    if root == None:
        return seq
    q.append(root)
    while len(q) > 0 or len(p) > 0:
        if len(p) == 0:
            s = []
            while len(q) > 0:
                node = q.pop(0)
                s.append(node.val)
                if node.left != None:
                    p.append(node.left)
                if node.right != None:
                    p.append(node.right)
            seq.append(s)
        elif len(q) == 0:
            s = []
            while len(p) > 0:
                node = p.pop(0)
                s.append(node.val)
                if node.left != None:
                    q.append(node.left)
                if node.right != None:
                    q.append(node.right)
            seq.append(s)
    seq.reverse()
    return seq