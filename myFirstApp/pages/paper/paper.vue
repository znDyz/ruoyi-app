<template>
	<view class="body">
		<!--左侧操作菜单-->
		<paper-left-popup :popupShow="popupShow"
			@hide="hidePopup"
			@addFriends="addFriends"
			@clearCache="clearCache"
			></paper-left-popup>
		<!--小纸条列表-->
		<block v-for="(item,index) in list" :key="index">
			<paper-list :item="item" :index="index"></paper-list>
		</block>
		<!--上拉加载-->
		<load-more :loadtext="loadtext"></load-more>
	</view>
</template>

<script>
	import paperList from "../../components/paper/paper-list.vue";
	import loadMore from "../../components/common/load-more.vue";
	import paperLeftPopup from "../../components/paper/paper-left-popup.vue";
	export default {
		components: {
			paperList,
			loadMore,
			paperLeftPopup
		},
		data() {
			return {
				popupShow:false,
				loadtext: "上拉加载更多...",
				list:[
					{
						userpic:"../../static/demo/userpic/12.jpg",
						username:"昵称一号",
						time:"10:21",
						data:"我是第一条信息",
						noreadnum:10
					},
					{
						userpic:"../../static/demo/userpic/12.jpg",
						username:"昵称二号",
						time:"10:21",
						data:"我是第二条信息",
						noreadnum:0
					},
					{
						userpic:"../../static/demo/userpic/12.jpg",
						username:"昵称三号",
						time:"10:21",
						data:"我是第三条信息",
						noreadnum:8
					},
					{
						userpic:"../../static/demo/userpic/12.jpg",
						username:"昵称三号",
						time:"10:21",
						data:"我是第三条信息",
						noreadnum:8
					},
					{
						userpic:"../../static/demo/userpic/12.jpg",
						username:"昵称三号",
						time:"10:21",
						data:"我是第三条信息",
						noreadnum:8
					},
					{
						userpic:"../../static/demo/userpic/12.jpg",
						username:"昵称三号",
						time:"10:21",
						data:"我是第三条信息",
						noreadnum:8
					},
					{
						userpic:"../../static/demo/userpic/12.jpg",
						username:"昵称三号",
						time:"10:21",
						data:"我是第三条信息",
						noreadnum:8
					}
				]
			}
		},
		//页面滚动到底部的事件(不是scroll-view滚到底)常用于下拉下一页数据
		onReachBottom(){
			this.loadmore();
		},
		//监听该页面用户下拉刷新事件
		onPullDownRefresh(){
			this.getData();
			uni.stopPullDownRefresh();
		},
		//监听原生标题栏按钮点击事件
		onNavigationBarButtonTap(e){
			if(e.index==0){
				uni.navigateTo({
					url: '../user-list/user-list'
				});
			}
			if(e.index==1){
				this.showPopup();
			}
		},
		methods: {
			addFriends(){
				console.log("添加好友");
				this.hidePopup();
			},
			clearCache(){
				console.log("清除缓存");
				this.hidePopup();
			},
			showPopup(){
				this.popupShow=true;	//显示菜单
			},
			hidePopup(){	
				this.popupShow=false;	//隐藏菜单
			},
			getData(){
				setTimeout(()=> {
					let arr = [
						{
							userpic:"../../static/demo/userpic/12.jpg",
							username:"下拉刷新1",
							time:"10:21",
							data:"我是第一条信息",
							noreadnum:0
						},
						{
							userpic:"../../static/demo/userpic/12.jpg",
							username:"下拉刷新2",
							time:"10:21",
							data:"我是第二条信息",
							noreadnum:5
						},
						{
							userpic:"../../static/demo/userpic/12.jpg",
							username:"下拉刷新3",
							time:"10:21",
							data:"我是第三条信息",
							noreadnum:9
						}
					];
					this.list = arr;
					uni.stopPullDownRefresh();
				}, 2000);
			},
			//上拉加载更多
			loadmore(){
				//如果不是"上拉加载"，证明已经在请求数据，所以直接return
				if(this.loadtext != "上拉加载更多..."){return;}
				//修改状态
				this.loadtext = "加载中...";
				//模拟获取数据
				setTimeout(()=>{
					//获取到数据
					let obj={
						userpic:"../../static/demo/userpic/12.jpg",
						username:"上拉继续加载",
						time:"10:21",
						data:"我是第三条信息",
						noreadnum:9
					};
					this.list.push(obj);				//将获取的数据添加到集合中
					this.loadtext = "上拉加载更多..."	//获取数据完成
				},1000);
				//this.tablist[this.tabIndex].loadtext = "没有更多数据了...";
			}
		}
	}
</script>

<style>
	.body{
		padding: 0 20upx;
	}
</style>
