package com.duckers.teart.repositories;
import java.util.List;
import com.duckers.teart.entities.ItemPedidoProduto;
import com.duckers.teart.repositories.Interfaces.ItemPedidoProdutoJPA;
import org.springframework.stereotype.Repository;

@Repository
public class ItemPedidoProdutoRepository {
    private ItemPedidoProdutoJPA itemPedidoProdutoJPA;

    public ItemPedidoProdutoRepository(ItemPedidoProdutoJPA itemPedidoProdutoJPA) {
        this.itemPedidoProdutoJPA = itemPedidoProdutoJPA;
    }

    public void createItemPedidoProduto(ItemPedidoProduto itemPedidoProduto) {
        itemPedidoProdutoJPA.save(itemPedidoProduto);
    }

    public ItemPedidoProduto getItemPedidoProdutoById(long id) {
        return itemPedidoProdutoJPA.findById(id).get();
    }

    public List<ItemPedidoProduto> getAllItemPedidosProduto() {
        return itemPedidoProdutoJPA.findAll();
    }

    public void deleteItemPedidoProduto(long id) {
        itemPedidoProdutoJPA.deleteById(id);
    }
}